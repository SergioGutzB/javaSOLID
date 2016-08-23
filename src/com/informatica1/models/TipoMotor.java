package com.informatica1.models;

public enum TipoMotor {
	MOTOR_GASOLINA(0),
	MOTOR_ELECTRICO(1);
	
	private int num;
	
	private TipoMotor (int num){		
		this.num = num;
	}

	public int getMotor() {
		return num;
	}
}
