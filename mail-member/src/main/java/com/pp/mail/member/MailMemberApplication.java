package com.pp.mail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 远程调用的一个步骤
 * 1.引入openfeigin
 * 2.编写一个接口,接口告诉springcloud这个接口里面的方法需要进行远程调用 到 别的服务里面的哪一个具体方法
 * 3.在启动类里面开启远程调用功能@EnableFeignClients 并告诉远程调用接口所在的位置
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.pp.mail.member.feign")
public class MailMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailMemberApplication.class, args);
	}

}
