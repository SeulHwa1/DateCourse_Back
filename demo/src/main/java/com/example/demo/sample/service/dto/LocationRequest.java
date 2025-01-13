package com.example.demo.sample.service.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationRequest {

    @NotEmpty
    private String name;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    private String category;
}