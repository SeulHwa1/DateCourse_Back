package com.example.demo.sample.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.sample.repository.LocationRepository;
import com.example.demo.sample.service.dto.LocationRequest;
import com.example.demo.sample.service.entity.Location;


@Service
public class LocationService {

    
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location saveLocation(LocationRequest locationRequest) {
        Location location = Location.builder()
        .name(locationRequest.getName())
        .latitude(locationRequest.getLatitude())
        .longitude(locationRequest.getLongitude())
        .category(locationRequest.getCategory())
        .build();
        

        return locationRepository.save(location);
    }
}
