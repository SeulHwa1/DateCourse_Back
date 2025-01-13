package com.example.demo.sample.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sample.service.LocationService;
import com.example.demo.sample.service.dto.LocationRequest;
import com.example.demo.sample.service.entity.Location;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @Autowired
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> locations = locationService.getAllLocations();
        return ResponseEntity.ok(locations);
    }

    // 장소 저장
    @PostMapping("/save")
    public ResponseEntity<Location> saveLocation(@RequestBody LocationRequest locationRequest) {
        Location savedLocation = locationService.saveLocation(locationRequest);
        return ResponseEntity.ok(savedLocation);
    }
}
