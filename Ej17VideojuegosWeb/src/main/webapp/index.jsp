<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String errorLogin = (String) request.getAttribute("errorLogin"); 
	if(errorLogin != null){
		out.println("<p style='color:red;'>" + errorLogin + "</p>");
	}
%>

<form action="LoginControlador" method="post">

  <div class="container">
  
    <label for="usuario"><b>Usuario</b></label>
    <input type="text" placeholder="Escriba el usuario" name="usuario" required>

    <label for="password"><b>Contraseña</b></label>
    <input type="password" placeholder="Password" name="password" required>

    <button type="submit">Login</button>
  
  </div>

</form>


</body>
</html>


