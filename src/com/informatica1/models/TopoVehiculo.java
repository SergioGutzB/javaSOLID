package com.informatica1.models;

public enum TopoVehiculo {
	AUTOMOVIL(0),
	AERONAVE(1);
	
	private int num;
	
	private TopoVehiculo (int num){		
		this.num = num;
	}

	public int getVehiculo() {
		return num;
	}
}
