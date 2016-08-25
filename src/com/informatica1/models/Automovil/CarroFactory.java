package com.informatica1.models.Automovil;

import com.informatica1.models.Motor.IMotor;

public class CarroFactory {

	public static Carro Create(IMotor motor, String marca) {
		Carro carro = null;
		carro = new Carro(motor, marca);

		return carro;
	}
}