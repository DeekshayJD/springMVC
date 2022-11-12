<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>first spring mvc success project</title>
</head>
<center>
<body bgcolor="pink">

<%
String name=(String)request.getAttribute("name");
int rollnum=(int)request.getAttribute("id");


%>

<h1>name is:--<%=name %></h1>
<h2>name is:--<%=rollnum %></h1>



<h1>name is :--
${id}
</h1>

</body>

</center>


</html>