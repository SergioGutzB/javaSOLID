<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" session="true"%>
<%@ page import="com.informatica1.models.Vehiculo"%>
<%
	HttpSession sesion = request.getSession();
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/foundation.min.css">
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="row">
		<div class="small-10 small-centered columns text-center">
			<h3>Generador de Vehículos y motores</h3>
		</div>
		<hr>
		<div class="small-7 columns text-center contenedor">
			<h4>Vehiculos</h4>
			<form action="./Vehiculo" method="get">
				<input type="hidden" name="accion" value="crear">
				<div class="row">
					<div class="medium-12 columns">
						<label>Marca<input type="text" name="marca" required>
						</label>
					</div>
				</div>
				<div class="row">
					<fieldset class="medium-12 columns">
						<legend>Selecione el tipo de vehiculo</legend>
						<input type="radio" name="vehiculo" value="carro" id="TipoCarro"
							required> <label for="TipoCarro">Carro</label> <input
							type="radio" name="vehiculo" value="avion" id="TipoAvion"
							required> <label for="TipoAvion">Avión</label>
					</fieldset>
				</div>
				<div class="row">
					<fieldset class="medium-12 columns">
						<legend>Selecione el tipo de motor</legend>
						<input type="radio" name="motor" value="gasolina" id="mGasolina"
							required> <label for="mGasolina">Gasolina</label> <input
							type="radio" name="motor" value="electrico" id="mElectrico" required>
						<label for="mElectrico">Eléctrico</label>
					</fieldset>
				</div>
				<button type="submit" class="expanded success button">Crear
					vehículo</button>
			</form>
		</div>
		<div class="small-5 columns text-center contenedor">
			<h4>Motores</h4>
		</div>
		<div class="small-12 columns contenedor">
			<%
				System.out.println("Cont: " + sesion.getAttribute("cont"));
				Vehiculo veh = null;
				if (request.getAttribute("carro") != null) {
					veh = (Vehiculo) request.getAttribute("carro");
					sesion.setAttribute("carro", veh);
				}
				if (request.getAttribute("avion") != null) {
					veh = (Vehiculo) request.getAttribute("avion");
					sesion.setAttribute("avion", veh);
				}
				if (veh != null) {
					ArrayList<Vehiculo> arV = (ArrayList<Vehiculo>) sesion.getAttribute("vehiculos");
					arV.add(veh);
					sesion.setAttribute("vehiculos", arV);
				}
				ArrayList<Vehiculo> arV = new ArrayList<Vehiculo>();
				if (sesion.getAttribute("vehiculos") != null) {
					arV = (ArrayList<Vehiculo>) sesion.getAttribute("vehiculos");
					System.out.println("Imprimiendo lista: " + arV.size());
					
					
				}
			%>


			<%
				for (Vehiculo v : arV) {
			%>
			<div class="row vehiculo">
				<div class="small-3 columns">
					<p>
						Marca:  <%=v.getMarca()%></p>
				</div>
				<div class="small-2 columns">
					<button type="button" class="primary button"
						onclick="alert('<%=v.acelerar()%>')">Acelerar</button>
				</div>
				<div class="small-2 columns">
					<button type="button" class="primary button"
						onclick="alert('<%=v.getClass().getSimpleName()%>')">Tipo</button>
				</div>

			</div>

			<%
				}
			%>
			<div class="row">
				<div class="small-3 small-right columns">
					<button type="button" class="warning button"
						onclick="<%sesion.invalidate();%> alert('Datos eliminados')">Eliminar
						datos</button>
				</div>
			</div>

		</div>
	</div>

	<script src="js/jquery.js"
		integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
		crossorigin="anonymous"></script>
	<!-- Compressed JavaScript -->
	<script src="js/foundation.min.js"></script>
</body>
</html>