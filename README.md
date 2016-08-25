# GENERADOR DE VEHICULOS

> SERGIO ALEXANDER GUTIÉRREZ
> 20101020039

# INSTALACION

Para la instalacion del proyecto se puede clonar con el comando

```
git clone https://github.com/fab48/zoologico.git
```

o se puede descargar el zip de la opcion ** _clone or download_ **

El proyecto se desarrollo en el IDE Eclipse, para funcionar es necesario tener intalado el servidor de aplicaciones JAVA (Apache Tomcat).

# EXPLICACION

El proyecto consiste en un generador de vehiculos (Automolviles y Aeronaves).
Cuando se crea un vehiculo el motor se crea automaticamente segun las especificaciones que le demos del tipo de motor. 
PPero es posible crear un motor, para luego intalarlo en un vehiculo creado, y debe funcionar correctamente. 
El vehículo solo tiene la función de acelar que es determinada por el tipo de motor instalado. 
 

## Principio de responsabilidad única


Se puede visualizar facilmente el el tipo de objeto (Avion, Carro, MotorGasolina, MotorElectrico), cada objeto cumple con una finalidad en concreta. 

## Principio de abierto/cerrado

En el modelo se puede observer este principio en la extension que se hace de la clase abstracta animal, asi mismo en la extension de los objetos mamifero y ave.
Se observa en la clase Abstracta Vehiculo donde los atributos propios son privados, y se pueden extender a los objetos Avion y Carro. 

## Principio de segregacion de interface.

El principio se aplica en cuando se quiere crear un vehiculo, el objeto tipo Carro o Avion, extiende de la calse abtracta Vehiculo e implementa la interfaz Automovil o Aeronave, respectivamente.
Así agregando solo las funcionalidades que necesita. Segregacion de interfaces (Automovil, Aeronave).

## Principio de sustitucion de liskov

Éste principio se ve facilmente en la Calse Vehiculo, que tiene un metodo acelerar(), este metodo hace referencia al metodo acelerar() del motor que tenga instalado el vehículo, así si se desea cambiar el tipo de motor.
el comportamiento del Vehiculo no cambia, y debe poder acelerar sin ningún  problema. 


## Principio de inversion de dependencias

El principio se ve en las calses (Vehiculo, IMotor, MotorGasolina, MotorElectrico)
El Vehiculo como clase superior no depende de una clase inferior (MotorGasolina, MotorElectrico) porque no la instancia directamente. solo es necesario un objeto que implemente al  interfaz IMotor. 
 