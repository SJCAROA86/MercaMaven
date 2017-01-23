<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%><!-- esto va en todos los jsp -->
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

<title>MENÚ</title>
</head>
<body>
	<div class="container text-center">
		<div class="row">
			<div class="col-md-6">
				<img
					src="https://www.mercadona.es/imagenes/1415435237___esp/logomercavertical.gif"
					width=300 height=200>
			</div>
			<div class="col-md-6">
				<h2>MENÚ</h2>

				<h3>
					<s:property value="#session.usuario" />
				</h3>

			</div>
		</div>


		<div class="row">

			<div class="col-md-6">
				<s:form action="listarProductos">
					<s:submit name="productos" value="PRODUCTOS"></s:submit>
				</s:form>
			</div>

			<div class="col-md-6">
				<s:form action="listarPedidos">
					<s:submit name="pedidos" value="PEDIDOS"></s:submit>
				</s:form>
			</div>

		</div>
	</div>



</body>
</html>