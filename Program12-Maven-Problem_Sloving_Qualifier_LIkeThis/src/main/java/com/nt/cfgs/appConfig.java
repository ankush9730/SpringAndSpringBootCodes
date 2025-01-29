package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource("classpath:com/nt/cfg/applicationContext.xml")  // Corrected
public class appConfig {
}
