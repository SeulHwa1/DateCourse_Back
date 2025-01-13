package com.example.demo.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.sample.service.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    
    
    List<Location> findByName(String name);
    
    
    List<Location> findByLatitudeBetweenAndLongitudeBetween(double minLatitude, double maxLatitude, double minLongitude, double maxLongitude);
    
    
    List<Location> findByLatitudeBetweenAndLongitudeBetweenAndRadiusLessThanEqual(double minLatitude, double maxLatitude, double minLongitude, double maxLongitude, int radius);
}
