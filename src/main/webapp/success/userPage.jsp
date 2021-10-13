<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserPage</title>
<link rel="stylesheet" type="text/css" href="CSS/file1.css" media="screen" />
</head>
<body>
	<div class="style1">
				<div align="left" >	
					<h1>You have logged in!</h1><br>
					<h3>Welcome, <s:property value="user.mailid"/></h3>
					<br>
		  			<h3>Your age = <s:property value="user.age"/></h3>
		  			
				</div>
	</div>			
</body>
</html>