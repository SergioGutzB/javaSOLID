package com.informatica1.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.informatica1.models.Avion;
import com.informatica1.models.AvionFactory;
import com.informatica1.models.Carro;
import com.informatica1.models.CarroFactory;
import com.informatica1.models.TipoMotor;

/**
 * Servlet implementation class Vehiculo
 */
// @WebServlet("/Vehiculo")
public class Vehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Carro v = null;
	Avion av = null;
	int cont = 0;
	ArrayList<Vehiculo>  arv = new ArrayList<Vehiculo>();
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("Generando vehiculo");
		System.out.println("Accion: " + request.getParameter("accion"));
		HttpSession session = request.getSession();
		if (cont <1){
			session.setAttribute("vehiculos", arv);
		}
		if (request.getParameter("accion").equals("crear"))
			if (request.getParameter("vehiculo") != null && request.getParameter("motor") != null) {
				if (request.getParameter("vehiculo").equals("carro")) {
					System.out.println("creando carro..");
					Carro v = null;
					if (request.getParameter("motor").equals("gasolina")) {
						System.out.println("creando motor gasolina..");
						v = CarroFactory.Create(TipoMotor.MOTOR_GASOLINA, request.getParameter("marca"));
					}
					if (request.getParameter("motor").equals("electrico")) {
						System.out.println("creando motor electrico..");
						v = CarroFactory.Create(TipoMotor.MOTOR_ELECTRICO, request.getParameter("marca"));
					}
					if (v != null) {
						request.setAttribute("carro", v);
						RequestDispatcher requestDispatcher; 
						requestDispatcher = request.getRequestDispatcher("index.jsp");
						requestDispatcher.forward(request, response);
						return;
					} else {
						response.sendRedirect("index.jsp?msg=No fue posible crear el carro.");
					}
				}
				if (request.getParameter("vehiculo").equals("avion")) {
					System.out.println("creando avion..");
					Avion av = null;
					if (request.getParameter("motor").equals("gasolina")) {
						System.out.println("creando motor gasolina..");
						av = AvionFactory.Create(TipoMotor.MOTOR_GASOLINA, request.getParameter("marca"));
					}
					if (request.getParameter("motor").equals("electrico")) {
						System.out.println("creando motor electrico..");
						av = AvionFactory.Create(TipoMotor.MOTOR_ELECTRICO, request.getParameter("marca"));
					}
					if (av != null) {
						request.setAttribute("avion", av);
						RequestDispatcher requestDispatcher; 
						requestDispatcher = request.getRequestDispatcher("index.jsp");
						requestDispatcher.forward(request, response);
						return;
					} else {
						response.sendRedirect("index.jsp?respuesta=No fue posible crear el avión.");
					}
				}

			}

		if (request.getParameter("accion").equals("acelerarCarro")) {
			
			Carro ve = (Carro) session.getAttribute("carro");
			response.sendRedirect("index.jsp?acelerar=" + ve.acelerar());
		}
		if (request.getParameter("accion").equals("accelerarAvion")) {
			response.sendRedirect("index.jsp?acelerar=" + av.acelerar());
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
