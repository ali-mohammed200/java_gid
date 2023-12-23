package com.vehicle.test;
import com.vehicle.*;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle myVehicle;
		
		myVehicle = new Car(5, "off", 1);
		
		myVehicle.ignite();
		myVehicle.changeGear(1);
		myVehicle.changeGear(1);
		myVehicle.changeGear(1);
		myVehicle.changeGear(1);
		myVehicle.changeGear(-1);
		
		Car myCar = (Car) myVehicle;
		
		myCar.showCarDetails();
		myCar.stop();
		
		myCar.showCarDetails();

	}

}
