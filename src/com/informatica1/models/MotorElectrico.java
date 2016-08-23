package com.informatica1.models;

public class MotorElectrico implements IMotor {

	public MotorElectrico() {
	}

	@Override
	public String acelerar() {
		System.out.println("Aumentando Voltaje");
		System.out.println("Acelerando MotorElectico");
		return "Aumentando voltaje para acelerar MotorElectico";
	}
}
