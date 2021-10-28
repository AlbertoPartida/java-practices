<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="es.curso.modelo.entidad.Videojuego" %>
<%@ page import="es.curso.modelo.negocio.GestorVideojuegos" %>
<html>
<head>
 <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>

<body>
<h1> Videojuego: ${juego.nombre}</h1>

<table>

	<tr>
		<th>ID</th>
		<th>NOMBRE</th>
		<th>COMPAÑIA</th>
		<th>NOTA MEDIA</th>
		<th>CREADOR</th>
		<th>WEB OFICIAL</th>
	</tr>
	<tr>
		<td>${juego.id}</td>
		<td>${juego.nombre}</td>
		<td>${juego.compania}</td>
		<td>${juego.notaMedia}</td>
		<td>${juego.nombreCreador}</td>
		<td>${juego.webOficial}</td>
	</tr>

</table>

<a href="volverListaVideojuegos">Listado Videojuegos</a>

</body>
</html>