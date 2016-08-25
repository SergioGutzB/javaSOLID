package com.informatica1.models;

import com.informatica1.models.Motor.IMotor;

public abstract class Vehiculo {
	private IMotor motor;
	private String marca;
	
	public Vehiculo(IMotor motor, String marca) {
		this.motor = motor;
		this.marca = marca;
	}
	
	public IMotor getMotor() {
		return motor;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setMotor(IMotor m) {
		this.motor = m;
	}
	
	public String acelerar(){
		if (motor != null)
            return motor.acelerar();
        else            
			return "no hace nada";
	}
}
