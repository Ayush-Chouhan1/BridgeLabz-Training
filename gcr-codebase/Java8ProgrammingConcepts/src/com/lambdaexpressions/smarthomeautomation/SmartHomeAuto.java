package com.lambdaexpressions.smarthomeautomation;

class SmartLight {
	public void runAction(LightAction action) {
		action.activate();
	}
}

public class SmartHomeAuto {

	public static void main(String[] args) {

	

	SmartLight light = new SmartLight();

	//Lambda expression
	LightAction dueToMotion = () -> System.out.println("Light on");
	LightAction DayTime = () -> System.out.println("Light off");
	LightAction voiceCommand = () -> System.out.println("Light on using voice command");

	light.runAction(dueToMotion);
	light.runAction(DayTime);
	light.runAction(voiceCommand);
    }

}
