package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.demo.app.customFilter","org.apache.apisix.plugin.runner"})
public class DemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}

}
//docker exec -it aa4c1a061018 /bin/bash
//docker cp C:/Users/CCS/Desktop/demoTest-0.0.1-SNAPSHOT.jar aa4c1a061018:/usr/local/apisix/