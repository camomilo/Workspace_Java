<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Busca de Empresas</title>
</head>
<body>
	Resultado da busca:
    <table>
    	<tr>
    		<th>ID</th>
    		<th>Nome</th>
    	</tr>
    	<c:forEach var="empresa" items="${empresas}">
	     <tr>
	       <td>${empresa.id}</td>
	      <td>${empresa.nome}</td>
	     </tr>
	    </c:forEach>
    </table>
	
</body>
</html>