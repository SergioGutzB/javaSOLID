package com.informatica1.models;

import java.util.ArrayList;

public class ListaVehiculos {
	//ATRIBUTOS
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private static ListaVehiculos lista = null;
    
    //CONSTRUCTOR
    private ListaVehiculos(){
        
    }
    
    //METODOS
    public static ListaVehiculos getListaVehiculos(){
        if (lista==null){
            lista = new ListaVehiculos();
        }
        return lista;
    }
    
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
        
    }

    public void adicionar(Vehiculo vehiculo) {
    	vehiculos.add(vehiculo);
        System.out.println("********************");
        System.out.println(vehiculos.get(0));
        System.out.println("********************");
    }

}
