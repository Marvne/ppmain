package com.pp.mail.product;

import com.pp.mail.product.entity.BrandEntity;
import com.pp.mail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailProductApplicationTests {


	@Autowired
   private BrandService brandService;

	@Test
	void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("123");

		brandEntity.setLogo("啦啦啦");


		brandService.save(brandEntity);


	}



}
