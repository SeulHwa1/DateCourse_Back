package com.example.demo.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sample.domain.Sample;
import com.example.demo.sample.service.SampleService;


@RestController
@RequestMapping("/sample") 
public class SampleController {

    @Autowired
    SampleService sampleService;
    
    @GetMapping("/{id}")
    public ResponseEntity<Sample> findSampleById(@PathVariable Long id) {
        Sample sample = sampleService.findById(id);
        return ResponseEntity.ok(sample);
    }

    @GetMapping("/name")
    public ResponseEntity<Sample> getMethodName(@RequestParam(required=false) String name) {

        Sample sample = sampleService.findByName(name);

        return ResponseEntity.ok(sample);
    }
    
}
