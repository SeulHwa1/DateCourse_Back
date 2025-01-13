package com.example.demo.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.sample.config.KakaoApiConfig;
@RestController
@RequestMapping("/api/map")
public class MapController {

    @Autowired
    private KakaoApiConfig kakaoApiConfig;

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL = "https://dapi.kakao.com/v2/local/search/keyword.json";

    @GetMapping("/search")
    @RequestMapping("/search")
    public String searchLocations(@RequestParam String query, @RequestParam double x, @RequestParam double y, @RequestParam int radius) {
        // Kakao API Key 가져오기
        String apiKey = kakaoApiConfig.getApiKey();

        System.out.println("Kakao API Key: " + apiKey);

        // 요청 URL 생성
        String url = String.format("%s?query=%s&x=%f&y=%f&radius=%d", BASE_URL, query, x, y, radius);

        // HTTP 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK " + apiKey);

        // HTTP 엔터티 생성
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // RestTemplate 사용하여 API 호출
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        // 응답 반환
        return response.getBody();
    }
}