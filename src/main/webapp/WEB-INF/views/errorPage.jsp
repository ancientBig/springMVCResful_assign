<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error found</title>
</head>
<body>
<div id="content">
	<h4 style="color: red; font: italic;">please choose different conversion units.</h4>
</div>
    <form:form method = "GET" action = "/accentureMARestfulSpring">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "convert again"/>
               </td>
            </tr>
         </table>  
      </form:form>

</body>
</html>