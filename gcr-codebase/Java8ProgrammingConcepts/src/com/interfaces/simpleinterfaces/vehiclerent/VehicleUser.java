package com.interfaces.simpleinterfaces.vehiclerent;

public class VehicleUser {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Vehicle bus = new Bus();
		Car car =  new Car();
		
		bike.rent();
		bike.returnVehicle();
		
		bus.rent();
		bus.returnVehicle();
		
		car.rent();
		car.returnVehicle();
		
		
	}

}
