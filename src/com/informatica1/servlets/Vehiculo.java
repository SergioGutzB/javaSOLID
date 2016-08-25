package com.informatica1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.informatica1.models.ListaMotores;
import com.informatica1.models.ListaVehiculos;
import com.informatica1.models.Aeronave.Avion;
import com.informatica1.models.Aeronave.AvionFactory;
import com.informatica1.models.Automovil.Carro;
import com.informatica1.models.Automovil.CarroFactory;
import com.informatica1.models.Motor.IMotor;
import com.informatica1.models.Motor.MotorElectrico;
import com.informatica1.models.Motor.MotorGasolina;

public class Vehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Integer contSerie = 100;

	public Vehiculo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		if (request.getParameter("accion").equals("crear")) {
			ListaVehiculos vehiculos = ListaVehiculos.getListaVehiculos();
			if (request.getParameter("vehiculo") != null && request.getParameter("motor") != null) {
				String marca = request.getParameter("marca");
				String serieMotor = "auto" + (contSerie++);
				String tipoMotor = request.getParameter("motor");
				if (request.getParameter("vehiculo").equals("carro")) {
					Carro carro = null;
					carro = CarroFactory.Create(crearMotor(tipoMotor, serieMotor), marca);

					if (carro != null) {
						vehiculos.adicionar(carro);
						response.sendRedirect("index.jsp");
					} else {
						response.sendRedirect("index.jsp?msg=No fue posible crear el carro.");
					}
				}
				if (request.getParameter("vehiculo").equals("avion")) {
					Avion avion = null;
					avion = AvionFactory.Create(crearMotor(tipoMotor, serieMotor), marca);

					if (avion != null) {
						vehiculos.adicionar(avion);
						response.sendRedirect("index.jsp");
					} else {
						response.sendRedirect("index.jsp?respuesta=No fue posible crear el avión.");
					}
				}
			}
		}

		if (request.getParameter("accion").equals("cambiarMotor")) {
			ListaVehiculos vehiculos = ListaVehiculos.getListaVehiculos();
			ListaMotores motores = ListaMotores.getListaMotores();
			int indexVehiculo = Integer.parseInt(request.getParameter("vehiculo"));
			int indexMotor = Integer.parseInt(request.getParameter("motor"));
			vehiculos.getVehiculos().get(indexVehiculo).setMotor(motores.getMotores().get(indexMotor));
			response.sendRedirect("index.jsp");
		}

		if (request.getParameter("accion").equals("crearMotor")) {
			String serieMotor = request.getParameter("serie");
			String tipoMotor = request.getParameter("motor");			
			crearMotor(tipoMotor, serieMotor);
			response.sendRedirect("index.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected IMotor crearMotor(String tmotor, String serie) {
		ListaMotores motores = ListaMotores.getListaMotores();
		IMotor motor = null;
		if (tmotor.equals("gasolina")) {
			motor = new MotorGasolina(serie);			
		} else {
			motor = new MotorElectrico(serie);
		}
		motores.adicionar(motor);
		return motor;
		
	}

}
