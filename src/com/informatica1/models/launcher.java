package com.informatica1.models;

import com.informatica1.models.Automovil.Carro;
import com.informatica1.models.Automovil.CarroFactory;
import com.informatica1.models.Motor.IMotor;
import com.informatica1.models.Motor.MotorElectrico;
import com.informatica1.models.Motor.MotorGasolina;

public class launcher {

	public static void main(String[] args) {
		IMotor motorGasolina= new MotorGasolina("SG345n");
		IMotor motorElectrico = new MotorElectrico("SE344");
		Carro carro = CarroFactory.Create(motorElectrico, "Toyota");
		System.out.println(carro.getMarca());
		carro.acelerar();
		System.out.println("Cambiando MotorGasolina por MotorElectrico...");
		carro.setMotor(motorGasolina);
		carro.acelerar();
	}
}
