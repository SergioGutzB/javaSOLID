package com.informatica1.models;

public class launcher {

	public static void main(String[] args) {
		Carro v = CarroFactory.Create(TipoMotor.MOTOR_GASOLINA, "Toyota");
		System.out.println(v.getMarca());
		v.acelerar();
		MotorElectrico me = new MotorElectrico();
		System.out.println("Cambiando MotorGasolina por MotorElectrico...");
		v.setMotor(me);
		v.acelerar();
	}
}
