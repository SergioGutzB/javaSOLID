package com.informatica1.models.Aeronave;

import com.informatica1.models.Motor.IMotor;

public class AvionFactory {

	public static Avion Create(IMotor motor, String marca)
    {
		Avion avion = null;
		
//		Creamos el obejeto de tipo Avion inyectandole la dependencia motor
		avion = new Avion(motor, marca); 
        
        return avion;        
    }
}