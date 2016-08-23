package com.informatica1.models;

public class CarroFactory {

	public static Carro Create(TipoMotor tipom, String marca)
    {
		Carro v = null;
		String ma = marca;
 
        switch(tipom)
        {
            case MOTOR_ELECTRICO:
                v = new Carro(new MotorElectrico(), ma);
                break;
            case MOTOR_GASOLINA:
                v = new Carro(new MotorGasolina(), ma);
                break;
            default:
                break;
        }
         
        return v;
    }

}
