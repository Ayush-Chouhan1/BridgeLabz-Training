package com.constructor.level1;

public class CircleDriver {
	
	public static void main(String[] args) {

		//initialize default constructor
		Circle circle1 = new Circle(34);
		circle1.areaCircle();

		//passing parameters in parameterized constructor
		Circle circle2 = new Circle(10.5);
		circle2.areaCircle();
	}

}
