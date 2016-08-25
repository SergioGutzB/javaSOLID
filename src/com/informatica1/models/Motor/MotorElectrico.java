package com.informatica1.models.Motor;

public class MotorElectrico implements IMotor {
	private String serie = "";
	public MotorElectrico(String serie) {
		this.serie = serie;
	}
	
	
	@Override
	public String getSerie() {
		return serie;
	}


	@Override
	public void setSerie(String serie) {
		this.serie = serie;
	}



	@Override
	public String acelerar() {
		System.out.println("Aumentando Voltaje");
		System.out.println("Acelerando MotorElectico");
		return "Aumentando voltaje para acelerar MotorElectico";
	}
	
}
