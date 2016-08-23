package com.informatica1.models;

public class Carro extends Vehiculo implements Automovil {

	public Carro(IMotor motor, String marca) {
		super(motor, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pitar() {
		// TODO Auto-generated method stub
		System.out.println("El carro está pitando");
	}

	@Override
	public void reversa() {
		// TODO Auto-generated method stub
		System.out.println("El carro está dando reversa");

	}

}
