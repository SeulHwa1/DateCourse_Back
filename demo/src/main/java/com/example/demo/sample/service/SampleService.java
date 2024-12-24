package com.example.demo.sample.service;

import org.springframework.stereotype.Service;

import com.example.demo.sample.domain.Sample;

@Service
public class SampleService {
    
    // private final SampleRepository sampleRepository;

    // public SampleService(SampleRepository sampleRepository) {
    //     this.sampleRepository = sampleRepository;
    // }

    public Sample findById(Long id) {
        return Sample.builder().name("none").build();
    }

    public Sample findByName(String name){
        return Sample.builder().name(name).build();
    }

}
