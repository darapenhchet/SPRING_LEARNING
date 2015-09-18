package com.kosign.wecafe.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "com.kosign.wecafe",
			   excludeFilters = @ComponentScan.Filter(Controller.class))
public class RootContextConfiguration {

}
