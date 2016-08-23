/**
 * 
 */
package com.informatica1.models;

/**
 * @author sergio
 *
 */
public class MotorGasolina implements IMotor {

	public MotorGasolina() {
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
