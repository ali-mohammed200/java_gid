package com.vehicle;

public abstract class Vehicle {
	public int vehicleNo;
	public String engineStatus;
	public int currentGear;
	
	public Vehicle(int vehicleNo, String engineStatus, int currentGear) {
		super();
		this.vehicleNo = vehicleNo;
		this.engineStatus = engineStatus;
		this.currentGear = currentGear;
	}
	
	public abstract void ignite();
	
	public abstract int changeGear(int flag);
	
	public abstract void stop();

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(String engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}
	
	
}
