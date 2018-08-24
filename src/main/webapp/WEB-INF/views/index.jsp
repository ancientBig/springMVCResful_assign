<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>conveter</title>
</head>
<body>

<div align="center">
		<form:form action="results" method="post" modelAttribute="convertMain">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2 style="color: blue;">Spring MVC  converter</h2></td>
				</tr>
		
				<tr>
					<td>Convert from:</td>
					<td>    <form:select path="selectedConvFrom" items="${fromDistanceList}" /></td>
				</tr>
				
				<tr>
					<td>Convert to:</td>
					<td><form:select path="selectedConvTo" items="${toDistanceList}" /></td>
				</tr>
				
				<tr>
					<td>unit:</td>
					<td><form:input path="userInput" /></td>
				</tr>
				
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="convert" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	
</body>
</html>