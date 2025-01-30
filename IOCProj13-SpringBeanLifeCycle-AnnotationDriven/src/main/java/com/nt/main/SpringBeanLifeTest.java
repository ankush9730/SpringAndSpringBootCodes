package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.VotingElgibilityChecking;

public class SpringBeanLifeTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		//get Spring Bean class obj ref
		VotingElgibilityChecking  vec=ctx.getBean("vec",VotingElgibilityChecking.class);
		// invoke b.method
		String resultMsg=vec.checkVotingElgibility();
		System.out.println(resultMsg);
       //close  IOC container
		ctx.close();
		
	}

}
