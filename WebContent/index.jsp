<%@page import="com.informatica1.models.ListaMotores"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" session="true"%>
<%@ page import="com.informatica1.models.Vehiculo"%>
<%@ page import="com.informatica1.models.Automovil.Carro"%>
<%@ page import="com.informatica1.models.Aeronave.Avion"%>
<%@ page import="com.informatica1.models.Motor.IMotor"%>
<%@ page import="com.informatica1.models.ListaVehiculos"%>
<%
	ListaVehiculos vehiculos = ListaVehiculos.getListaVehiculos();
	ListaMotores motores = ListaMotores.getListaMotores();
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
		<div class="small-8 columns text-center contenedor">
			<h4>Vehiculos</h4>
			<div class="small-12 columns">
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
								type="radio" name="motor" value="electrico" id="mElectrico"
								required> <label for="mElectrico">Eléctrico</label>
						</fieldset>
					</div>
					<button type="submit" class="expanded success button">Crear
						vehículo</button>
				</form>
			</div>
			<div class="small-12 columns contenedor">
				<%
					for (Vehiculo v : vehiculos.getVehiculos()) {
				%>
				<div class="row vehiculo">
					<div class="small-2 columns">
						<p>
							Marca:
							<%=v.getMarca()%></p>
					</div>
					<div class="small-2 columns">
						<button type="button" class="primary button"
							onclick="alert('<%=v.acelerar()%>')">Acelerar</button>
					</div>
					<div class="small-2 columns">
						<button type="button" class="primary button"
							onclick="alert('<%=v.getClass().getSimpleName()%>')">Tipo</button>
					</div>
					<div class="small-6 columns">
						<form action="./Vehiculo" method="get">
							<div class="row">
								<div class="small-8 columns">
									<label>Seleccione Motor<select name="motor">
											<%
												for (IMotor motor : motores.getMotores()) {
											%>
											<option value="<%= motores.getMotores().indexOf(motor)%>"><%=motor.getSerie()%></option>
											<%
												}
											%>
									</select>
									</label>
								</div>
								<div class="small-4 columns">
									<button type="submit" class="primary button"
										onclick="alert('Cambiando motor')">Cambiar motor</button>
								</div>
							</div>
							<input type="hidden" name="accion" value="cambiarMotor">
							<input type="hidden" name="vehiculo" value="<%= vehiculos.getVehiculos().indexOf(v)%>">
						</form>
					</div>
				</div>
				<%
					}
				%>

			</div>
		</div>

		<div class="small-4 columns text-center contenedor">
			<h4>Motores</h4>
			<div class="small-12 columns">
				<form action="./Vehiculo" method="get">
					<input type="hidden" name="accion" value="crearMotor">
					<div class="row">
						<div class="medium-12 columns">
							<label>Serie<input type="text" name="serie" required>
							</label>
						</div>
					</div>
					<div class="row">
						<fieldset class="medium-12 columns">
							<legend>Selecione el tipo de motor</legend>
							<input type="radio" name="motor" value="gasolina"
								id="TipoGasolina" required> <label for="TipoGasolina">Motor
								a Gasolina</label> <input type="radio" name="motor" value="electrico"
								id="TipoElectrico" required> <label for=""TipoElectrico"">Motor
								Eléctrico</label>
						</fieldset>
					</div>

					<button type="submit" class="expanded success button">Crear
						Motor</button>
				</form>
			</div>
			<div class="small-12 columns contenedor">
				<%
					for (IMotor motor : motores.getMotores()) {
				%>
				<div class="row vehiculo">
					<div class="small-6 columns">
						<p>
							Serie:
							<%=motor.getSerie()%></p>
					</div>
					<div class="small-6 columns">
						<p>
							Tipo Motor:
							<%=motor.getClass().getSimpleName()%></p>
					</div>
				</div>
				<%
					}
				%>

			</div>
		</div>

	</div>

	<script src="js/jquery.js"></script>
	<script src="js/foundation.min.js"></script>
</body>
</html>