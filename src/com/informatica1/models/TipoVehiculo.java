package com.informatica1.models;

public enum TipoVehiculo {
	AUTOMOVIL(0),
	AERONAVE(1);
	
	private int num;
	
	private TipoVehiculo (int num){		
		this.num = num;
	}

	public int getVehiculo() {
		return num;
	}
}
