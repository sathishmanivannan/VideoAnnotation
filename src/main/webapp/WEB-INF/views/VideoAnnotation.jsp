<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <iframe width="420" height="315" src="https://www.youtube.com/embed/Zjsb62fxZxY" frameborder="0" allowfullscreen></iframe> 
	    <form:form method="POST" action="/addpersonvalue/" modelAttribute="employee">
             <table>
                <tr>
                    <td><form:label path="name">Number of distinct persons</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>