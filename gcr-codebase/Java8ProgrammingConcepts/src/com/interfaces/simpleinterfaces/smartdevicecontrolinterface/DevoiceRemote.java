package com.interfaces.simpleinterfaces.smartdevicecontrolinterface;

public class DevoiceRemote {
	public static void main(String[] args ) {
		Lights bulb = new Lights();
		TV tv = new TV();
		AC ac = new AC();
		
		bulb.turnOn();
		bulb.turnOf();
		
		tv.turnOn();
		tv.turnOf();
		
		ac.turnOn();
		ac.turnOf();
		
	}

}
