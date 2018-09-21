package com.hn.keeper.starter;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hn.keeper.starter")
public class KeeperModuleConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(KeeperModuleConfiguration.class);

	@PostConstruct
	public void postConstruct() {
		logger.info("=======================================================================================");
		logger.info("======================         KEEPING MODULE LOADED!          ========================");
		logger.info("=======================================================================================");
	}
}
