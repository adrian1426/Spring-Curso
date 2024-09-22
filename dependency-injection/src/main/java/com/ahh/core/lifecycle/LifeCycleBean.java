package com.ahh.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleBean implements BeanNameAware{
	public static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("Bean name: {}",name);
	}

	@PostConstruct
	public void init() {
		log.info("Post Construct");
	}
	
	@PreDestroy
	public void destroy() {
		log.info("Pre destroy");
	}
}
