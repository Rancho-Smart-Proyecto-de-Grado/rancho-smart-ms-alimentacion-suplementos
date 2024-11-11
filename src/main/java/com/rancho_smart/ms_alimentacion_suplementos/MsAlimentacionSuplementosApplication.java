package com.rancho_smart.ms_alimentacion_suplementos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsAlimentacionSuplementosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAlimentacionSuplementosApplication.class, args);
	}

}
