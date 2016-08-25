package com.informatica1.models.Aeronave;

import com.informatica1.models.Vehiculo;
import com.informatica1.models.Motor.IMotor;

public class Avion extends Vehiculo implements Aeronave {

	public Avion(IMotor motor, String marca) {
		super(motor, marca);
	}

	@Override
	public void despegar() {
		System.out.println("El avión esta despegando");

	}

	@Override
	public void aterrizar() {
		System.out.println("El avión esta aterrizando");
	}

	@Override
	public void planear() {
		System.out.println("El avión esta planeando");

	}

}
