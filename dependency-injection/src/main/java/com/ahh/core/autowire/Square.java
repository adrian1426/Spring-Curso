package com.ahh.core.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {
	
	@Value("${squire.side:0}")
	private double side;

	@Override
	public double calculateArea() {
		return side * side;
	}

}
