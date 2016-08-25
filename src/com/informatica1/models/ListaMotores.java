package com.informatica1.models;

import java.util.ArrayList;

import com.informatica1.models.Motor.IMotor;

public class ListaMotores {
	//ATRIBUTOS
    private static ArrayList<IMotor> motores = new ArrayList<IMotor>();
    private static ListaMotores lmotor = null;
    
    //CONSTRUCTOR
    private ListaMotores(){        
    }
    
    //METODOS
    public static ListaMotores getListaMotores(){
        if (lmotor==null){
        	lmotor = new ListaMotores();
        }
        return lmotor;
    }
    
    public ArrayList<IMotor> getMotores(){
        return motores;        
    }

    public void adicionar(IMotor motor) {
    	motores.add(motor);
    }
}
