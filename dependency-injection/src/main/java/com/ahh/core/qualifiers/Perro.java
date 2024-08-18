package com.ahh.core.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal{

	public Perro(@Value("Rocklee") String nombre,@Value("2") Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

}
