<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
<link rel="stylesheet" type="text/css" href="CSS/file1.css" media="screen" />
</head>
<body>
	<div class="style1">
          <s:actionerror/>
          <s:form  method="post" action="signupaction">
                <h1>User<br>Sign Up</h1>
    
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
						<s:select list="{'developer','HR','marketing'}" name="user.department"></s:select>
						
					</div>	
					
					<div>
						<s:label>Age</s:label>
						<s:textfield label="Age" name="user.age" value="0"/>
					</div>
					<s:submit value="signup"></s:submit>
                                            
                    <span>Have an Account?</span>
                    <a href='login.jsp' class="submit-form">Login</a>
                      
          </s:form>
      </div>    

</body>
</html>