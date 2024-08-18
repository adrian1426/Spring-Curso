package com.ahh.core.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pajaro extends Animal implements Volar {
	
	public static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	public Pajaro(@Value("Pajarito") String nombre,@Value("1") Integer edad) {
		super(nombre, edad);
	}

	@Override
	public void volar() {
		log.info("Soy un Pájaro y estoy volando...");
	}

}
