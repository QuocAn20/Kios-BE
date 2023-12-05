package com.example.kiosbankingbe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@MapperScan(basePackages = {"com.example.kiosbankingbe.mapper"})
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class KiosBankingBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiosBankingBeApplication.class, args);
	}

//	@Bean
//	public SimpMessagingTemplate messagingTemplate() {
//		return new SimpMessagingTemplate((message, timeout) -> {
//            log.info("SimpMessagingTemplate > send...");
//            return true;
//        });
//	}
}
