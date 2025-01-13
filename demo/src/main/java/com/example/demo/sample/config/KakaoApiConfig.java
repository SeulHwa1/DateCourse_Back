package com.example.demo.sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KakaoApiConfig {
    
    @Value("${kakao.api.key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
