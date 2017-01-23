<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/estilos.css">

<script src="https://code.jquery.com/jquery-3.1.1.js"
	integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="js/miscript.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>INICIO</title>
</head>
<body>

<div class="row text-center">
		<div class="col-md-6">
			<img
				src="https://www.mercadona.es/imagenes/1415435237___esp/logomercavertical.gif"
				width=300 height=200>
		</div>
		<div class="col-md-6">
			<h2>LOGIN</h2>
		</div>
	</div>
	
	
	
	<div class="container text center">
		<div class="col-md-6">
			<s:form action="login">
				<s:textfield name="usuario" placeholder="nombre" />
				<s:textfield name="pass" placeholder="password" type="password" />
				<s:submit name="logeo" value="Enviar"></s:submit>
			</s:form>
		</div>
		<div class="col-md-6">
			<s:form action="register">
				<s:textfield name="usuario" placeholder="usuario" />
				<s:textfield name="pass" placeholder="password" type="password" />
				<s:textfield name="nombre" placeholder="nombre" />
				<s:textfield name="apellido1" placeholder="primer apellido" />
				<s:textfield name="apellido2" placeholder="segundo apellido" />
				<s:textfield name="telefono" placeholder="tlf" />
				<s:textfield name="direccion" placeholder="direccion" />
				<s:textfield name="email" placeholder="email" />
				<s:submit name="registro" value="Registrar"></s:submit>
			</s:form>
		</div>
	</div>

</body>
</html>