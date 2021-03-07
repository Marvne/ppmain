package com.pp.mail.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pp.mail.order.dao")
public class MailOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailOrderApplication.class, args);
	}

}
