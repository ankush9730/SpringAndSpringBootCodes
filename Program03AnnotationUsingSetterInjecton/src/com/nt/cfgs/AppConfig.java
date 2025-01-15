package com.nt.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	@Bean(name="lt")
	public LocalTime getTime() {
		return LocalTime.now();
	}
	
	@Bean(name="ld")
	public LocalDate getDate() {
		return LocalDate.now();
	}
}
