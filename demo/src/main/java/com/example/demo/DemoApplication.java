package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
    exclude = {DataSourceAutoConfiguration.class}, // 데이터베이스 자동 설정 제외
    scanBasePackages = "com.example.demo.sample" // 필요한 패키지 스캔
)

// @EnableJpaRepositories(basePackages = "com.example.demo.sample.repository") // 리포지토리 스캔 경로 추가
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
