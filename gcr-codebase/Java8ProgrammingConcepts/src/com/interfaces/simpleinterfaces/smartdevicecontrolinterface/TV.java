package com.interfaces.simpleinterfaces.smartdevicecontrolinterface;

public class TV implements DeviceControllable {

	@Override
	public void turnOn() {
		System.out.println("TV turned on.");
		
	}

	@Override
	public void turnOf() {
		System.out.println("TV turned off.");
		
	}
	
	
	

}
