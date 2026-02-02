package com.interfaces.simpleinterfaces.smartdevicecontrolinterface;

public class Lights implements DeviceControllable{

	@Override
	public void turnOn() {
		System.out.println("Lights turned on.");
		
	}

	@Override
	public void turnOf() {
		System.out.println("Lights turned off.");
		
	}
	

}
