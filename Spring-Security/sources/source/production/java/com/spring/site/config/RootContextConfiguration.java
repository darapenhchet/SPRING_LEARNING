package com.spring.site.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;


@Configuration
@ComponentScan(
		basePackages= "com.spring.site",
		excludeFilters = @ComponentScan.Filter(Controller.class)
)
@Import({SecurityConfiguration.class})
public class RootContextConfiguration {

}
