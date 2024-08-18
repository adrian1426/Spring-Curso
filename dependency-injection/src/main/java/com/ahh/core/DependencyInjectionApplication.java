package com.ahh.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ahh.core.scopes.EjemploScopeService;


@SpringBootApplication
public class DependencyInjectionApplication {
	
	public static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		EjemploScopeService ejemploScopeService=context.getBean(EjemploScopeService.class);
		EjemploScopeService ejemploScopeService2=context.getBean(EjemploScopeService.class);
		
		log.info("Bean equals {}",ejemploScopeService.equals(ejemploScopeService2));
		log.info("Bean == {}",ejemploScopeService==ejemploScopeService2);

	}

}
