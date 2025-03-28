package com.example.products_ms;

import com.example.products_ms.models.Product;
import com.example.products_ms.repositories.ProductsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsMsApplication implements CommandLineRunner {
	public static final Logger logger = LoggerFactory.getLogger(ProductsMsApplication.class);

	private ProductsRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsMsApplication.class, args);
		logger.info("Hello World!");
		logger.info("This is my application with MSA and SpringBoot");
	}

	@Override
	public void run(String... args) throws Exception {
		//epo.deleteAll();
		//repo.findAll();


		//for (Product p : repo.findAll()) {
		//	System.out.printf("Product: "  + p);
		//}

	}
}
