package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyBean {

	public MyBean() {
		System.out.println("MyBean Instance Created!");
	}
	public void showMessage() {
		System.out.println("Hello from MyBean!");
	}
}
