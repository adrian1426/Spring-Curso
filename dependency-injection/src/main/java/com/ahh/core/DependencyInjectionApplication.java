package com.ahh.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ahh.core.atributo.Coche;
import com.ahh.core.qualifiers.Animal;
import com.ahh.core.qualifiers.Pajaro;
import com.ahh.core.qualifiers.Perro;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	public static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		Animal animal = context.getBean("pajaro",Animal.class);

		log.info("Animal nombre= {} edad= {}",animal.getNombre(), animal.getEdad());
	}

}
