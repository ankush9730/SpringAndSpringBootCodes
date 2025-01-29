package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDCCourier implements Courier {
    @Override
    public void deliver(String packageDetails) {
        System.out.println("DTDC is delivering the package: " + packageDetails);
    }
}
