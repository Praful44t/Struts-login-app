<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" type="text/css" href="CSS/file1.css" media="screen" />
</head>
<body>
	<div class="style1">
	      <s:actionerror/>
          <s:form  method="post" action="loginaction">
                <h1>User<br>Sign In</h1>
    
                    <div>
                    	<s:label>Mail</s:label>
                        <s:textfield type="email" name="user.mailid" required="required"></s:textfield>
                    </div>
    
                    <div>
                    	<s:label>Password</s:label>
                        <s:password name="user.password" required="required"></s:password>
                    </div>
					
					<div>
						<s:label>Department</s:label>
						<s:select list="{'developer','HR','marketing'}" name="user.department" ></s:select>
					</div>	
					<s:submit value="login"></s:submit>
                        
                    <span>Don't have an Account?</span>
                    <a href='signup.jsp' class="submit-form">Sign Up</a>
                      
          </s:form>
      </div>    
          
</body>
</html>