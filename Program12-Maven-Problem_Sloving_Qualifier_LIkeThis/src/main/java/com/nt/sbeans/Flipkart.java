package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("fpkt")
@PropertySource("classpath:com/nt/commans/Courierservice.properties")  // Corrected
public class Flipkart {

    @Autowired
    @Qualifier("dtdc")  // Ensuring only BlueDart is injected
    private Courier courier;

    public void placeOrder(String packageDetails) {
        System.out.println("Order placed for: " + packageDetails);
        System.out.println("Courier service: " + courier.getClass().getSimpleName());  // To print the name of the courier bean used
        courier.deliver(packageDetails);
    }

}
