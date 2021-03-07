package com.pp.mail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pp.mail.coupon.dao")
public class MailCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailCouponApplication.class, args);
	}

}
