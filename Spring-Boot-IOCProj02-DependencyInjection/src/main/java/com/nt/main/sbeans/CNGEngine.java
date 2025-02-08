package com.nt.main.sbeans;

import org.springframework.stereotype.Component;

@Component("CngEngine")
public class CNGEngine implements IEngine
{
	public CNGEngine() {
		System.out.println("CNGEngine::0-param Constructoer");
	}

	@Override
	public void start()
	{
		System.out.println("CNGEngine.start()::Engine started");
	}

	@Override
	public void stop() 
	{
		System.out.println("CNGEngine.stop()::Engine stopped");

	}

}
