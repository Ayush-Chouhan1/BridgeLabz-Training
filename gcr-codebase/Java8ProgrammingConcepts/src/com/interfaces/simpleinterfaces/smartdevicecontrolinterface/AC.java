package com.interfaces.simpleinterfaces.smartdevicecontrolinterface;

public class AC implements DeviceControllable {

	@Override
	public void turnOn() {
		System.out.println("AC tuned on.");
	}
	@Override
	public void turnOf() {
		System.out.println("AC tuned off");
	}
}
