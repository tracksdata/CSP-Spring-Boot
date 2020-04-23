package com.cts.employee.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.cts.employee.dao,com.cts.employee.service")
@ComponentScans(value = { @ComponentScan("com.cts.employee.service"), 
		                  @ComponentScan("com.cts.employee.dao") })
public class AppConfig {

}
