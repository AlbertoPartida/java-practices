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

<% 

Videojuego juego = (Videojuego)request.getAttribute("juego");

%>


<body>
<%

out.println("<h1> Videojuego: " + juego.getNombre() + "</h1>");

%>
	
	
<table>
	<tr>
		<th>ID</th>
		<th>NOMBRE</th>
		<th>COMPAÑIA</th>
		<th>NOTA MEDIA</th>
		<th>CREADOR</th>
		<th>WEB OFICIAL</th>
	</tr>
<% 

	out.println("<tr><td>" + juego.getId() + "</td>");
	out.println("<td>" + juego.getNombre() + "</td>");
	out.println("<td>" + juego.getCompania() + "</td>");
	out.println("<td>" + juego.getNotaMedia() + "</td>");
	out.println("<td>" + juego.getNombreCreador() + "</td>");
	out.println("<td>" + juego.getWebOficial() + "</td></tr>");

%>

</table>

<a href="listaVideojuegos.jsp">Listado Videojuegos</a>

</body>
</html>