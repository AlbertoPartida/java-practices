<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
  text-align: center;
}
</style>
</head>

<body>
	<h1>Lista de Videojuegos:</h1>
<table>
	<tr>
		<th>ID</th>
		<th>NOMBRE</th>
		<th>COMPAÑIA</th>
		<th>NOTA MEDIA</th>
	</tr>
	
	<c:forEach items="${sessionListaVideojuegos}" var="videojuego">
        <tr>
          <td><c:out value="${videojuego.id}"></c:out></td>
          <td><c:out value="${videojuego.nombre}"></c:out></td>
          <td><c:out value="${videojuego.compania}"></c:out></td>
          <td><c:out value="${videojuego.notaMedia}"></c:out></td>
          
        </tr>
      </c:forEach> 

</table>

<form action="videojuegosControlador" method="post">

  <div class="container">

  <h3>Detalle Videojuego</h3>
  
    <label for="id"><b>Id juego</b></label>
    <input type="text" placeholder="Videojuego" name="id" required>

    <button type="submit">Detalle</button>
  
  </div>

</form>

<% String errorVideojuego = (String) request.getAttribute("errorVideojuego"); 
	if(errorVideojuego != null){
		out.println("<p style='color:red;'>" + errorVideojuego + "</p>");
	}
%>
	
</body>
</html>