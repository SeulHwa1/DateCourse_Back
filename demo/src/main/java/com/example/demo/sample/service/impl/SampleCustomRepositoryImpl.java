package com.example.demo.sample.service.impl;

import com.example.demo.sample.domain.Sample;

public class SampleCustomRepositoryImpl implements SampleCustomRepository{
    
    @Override
    public Sample findByName(String name){
        return Sample.builder().name(name).build();
    };
}
