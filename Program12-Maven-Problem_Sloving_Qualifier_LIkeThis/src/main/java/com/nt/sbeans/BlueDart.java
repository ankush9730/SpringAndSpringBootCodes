package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements Courier {
    @Override
    public void deliver(String packageDetails) {
        System.out.println("BlueDart is delivering the package: " + packageDetails);
    }
}
