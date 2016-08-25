# GENERADOR DE VEHICULOS

> SERGIO ALEXANDER GUTIÉRREZ
> 20101020039

# INSTALACION

Para la instalacion del proyecto se puede clonar con el comando

```
git clone https://SergioGutzB@bitbucket.org/SergioGutzB/vehiculosolid.git
```

o se puede descargar el zip en el link ** https://bitbucket.org/SergioGutzB/vehiculosolid/downloads **

El proyecto se desarrollo en el IDE Eclipse, para funcionar es necesario tener intalado el servidor de aplicaciones JAVA (Apache Tomcat).

# EXPLICACION

El proyecto consiste en un generador de vehiculos (_Automolviles_ y _Aeronaves_).
Cuando se crea un vehículo el motor se crea automaticamente segun las especificaciones que le demos del tipo de motor ( _MotorGasolina_, _MotorElectrico_). 
Es posible crear un motor, para luego instalarlo en un vehículo ya creado y cambiarlo por el que tenía, no importa el tipo de motor debe funcionar correctamente. 
El vehículo solo tiene la función de acelerar que es determinada por el tipo de motor instalado. 
 

## Principio de responsabilidad única


Se puede visualizar facilmente el el tipo de objeto (_Avion_, _Carro_, _MotorGasolina_, _MotorElectrico_), cada objeto cumple con una finalidad en concreta. 

## Principio de abierto/cerrado

Se observa en la clase Abstracta _Vehiculo_ donde los atributos propios son privados, y se pueden extender a los objetos tipo _Avion_ y _Carro_. 

## Principio de segregacion de interface.

El principio se aplica en cuando se quiere crear un vehículo, el objeto tipo _Carro_ o _Avion_, extienden de la calse abtracta _Vehiculo_ e implementa la interfaz _Automovil_ o _Aeronave_, respectivamente.

Así se agrega sólo las funcionalidades que necesita. Segregacion de interfaces (_Automovil_, _Aeronave_).

## Principio de sustitucion de liskov

Éste principio se ve facilmente en la Calse _Vehiculo_, tiene un método _acelerar()_, éste método hace referencia al método _acelerar()_ del motor (implementa la interfaz _IMotor_) que tenga instalado el vehículo, así, si se desea cambiar el tipo de motor el comportamiento del vehículo no cambia, y debe poder acelerar sin ningún  problema. 


## Principio de inversion de dependencias

El principio se ve en las calses (_Vehiculo_, _IMotor_, _MotorGasolina_, _MotorElectrico_)
El Vehiculo como clase superior no depende de una clase inferior (_MotorGasolina_, _MotorElectrico_) porque no la instancia directamente, sólo es necesario un objeto que implemente al  interfaz _IMotor_s. 
 