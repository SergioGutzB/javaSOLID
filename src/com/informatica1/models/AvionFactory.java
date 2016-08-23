package com.informatica1.models;

public class AvionFactory {

	public static Avion Create(TipoMotor tipom, String marca)
    {
		Avion av = null;
		String ma = marca;
 
        switch(tipom)
        {
            case MOTOR_ELECTRICO:
            	av = new Avion(new MotorElectrico(), ma);
                break;
            case MOTOR_GASOLINA:
            	av = new Avion(new MotorGasolina(), ma);
                break;
            default:
                break;
        }
         
        return av;
    }

}
