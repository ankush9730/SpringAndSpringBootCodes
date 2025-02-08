package com.nt.main.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class EletricEngine implements IEngine{

	public EletricEngine() {
		System.out.println("EletricEngine::0-param Constructor");
	}
	
	@Override
	public void start()
	{
		System.out.println("EletricEngine.start()::Engine started");
	}

	@Override
	public void stop() 
	{
		System.out.println("EletricEngine.stop()::Engine stopped");
	}
	

}
