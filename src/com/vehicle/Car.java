package com.vehicle;

public class Car extends Vehicle {
	public boolean powerSteering;
	public String fuelType;
	
	
	public Car(int vehicleNo, String engineStatus, int currentGear, boolean powerSteering, String fuelType) {
		super(vehicleNo, engineStatus, currentGear);
		this.powerSteering = powerSteering;
		this.fuelType = fuelType;
	}
	
	public Car(int vehicleNo, String engineStatus, int currentGear) {
		super(vehicleNo, engineStatus, currentGear);
	}
	
	public void showCarDetails() {
		System.out.println("Car [powerSteering=" + powerSteering + ", fuelType=" + fuelType + ", vehicleNo=" + vehicleNo
				+ ", engineStatus=" + engineStatus + ", currentGear=" + currentGear + "]");
	}


	@Override
	public void ignite() {
		// TODO Auto-generated method stub
		this.setEngineStatus("on");
		this.setCurrentGear(1);
	}


	@Override
	public int changeGear(int flag) {
		// TODO Auto-generated method stub
		
		switch(flag) {
		  case 1:
		    // code block
			  if(this.getCurrentGear() < 6) {
				  this.setCurrentGear(this.getCurrentGear() + 1);
			  }
		    break;
		  case -1:
		    // code block
			  if(this.getCurrentGear() > 1) {
				  this.setCurrentGear(this.getCurrentGear() - 1);
			  }
		    break;
		}
		
		return this.getCurrentGear();
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		this.setEngineStatus("off");
		this.setCurrentGear(0);
	}
}
