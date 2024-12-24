package com.example.demo.sample.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Sample {
    Long id;
    String name;


    public Sample(Long id, String name){
        this.id = id;
        this.name = name;
    };

    public Sample(Long id){
        this.id = id;
        this.name = "annoymous";
    }


}
