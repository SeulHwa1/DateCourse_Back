package com.example.demo.sample.service.impl;

import com.example.demo.sample.domain.Sample;

public interface SampleCustomRepository {
    
    Sample findByName(String name);

}
