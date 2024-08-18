package com.ahh.core.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Avion implements Volar{
	
	public static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	@Override
	public void volar() {
		log.info("Soy un Avion y estoy volando...");
	}

}
