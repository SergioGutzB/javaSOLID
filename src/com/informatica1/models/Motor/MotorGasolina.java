/**
 * 
 */
package com.informatica1.models.Motor;

/**
 * @author sergio
 *
 */
public class MotorGasolina implements IMotor {

	private String serie = "";
	
	public MotorGasolina(String serie) {
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
		System.out.println("Realizar Admision");
		System.out.println("Realizar Compresion");
		System.out.println("Realizar Combustion");
		System.out.println("Realizar Escape");
		System.out.println("Acelerando MotorGasolina");
		return "Realizar (Admision, Compresion, Combustion, Escape) para acelerar MotorGasolina"; 
	}
}
