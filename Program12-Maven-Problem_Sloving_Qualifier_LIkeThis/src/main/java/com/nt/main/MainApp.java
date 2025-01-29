package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.cfgs.appConfig;
import com.nt.sbeans.Flipkart;

public class MainApp {
    public static void main(String[] args) {
        // Create IOC container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
        
        // Get the Flipkart bean
        Flipkart f = ctx.getBean("fpkt", Flipkart.class);
        f.placeOrder("Electronic - Laptop");
        
        ctx.close();
    }
}
