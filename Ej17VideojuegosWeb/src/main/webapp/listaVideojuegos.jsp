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

GestorVideojuegos gv = new GestorVideojuegos();
List <Videojuego> listaVideojuegos = gv.listar();

%>


<body>
	<h1>Lista de Videojuegos:</h1>
	
<table>
	<tr>
		<th>ID</th>
		<th>NOMBRE</th>
		<th>COMPAÑIA</th>
		<th>NOTA MEDIA</th>
	</tr>
<% 
for(int i = 0; i<listaVideojuegos.size(); i++){
	out.println("<tr><td>" + listaVideojuegos.get(i).getId() + "</td>");
	out.println("<td>" + listaVideojuegos.get(i).getNombre() + "</td>");
	out.println("<td>" + listaVideojuegos.get(i).getCompania() + "</td>");
	out.println("<td>" + listaVideojuegos.get(i).getNotaMedia() + "</td></tr>");
}
%>

</table>

<form action="VideojuegosControlador" method="post">

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