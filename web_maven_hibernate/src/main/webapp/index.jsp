<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css">
</head>
  <body>
	  <jsp:useBean id="CustomerRegristration" class="beans.CustomerRegristrationBean" scope="session" />
	
	<form action="">
  <div class="container">
    <h1>Register </h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
    <label for="firstName"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="firstName" id="firstName" required>
    
    <label for="lastName"><b>lastName</b></label>
    <input type="text" placeholder="Enter lastName" name="lastName" id="lastName" required>
    
    
    <label for="mobileNumber"><b>mobileNumber</b></label>
    <input type="text" placeholder="Enter mobileNumber" name="mobileNumber" id="mobileNumber" required>
    
    
    <label for="phoneNumber"><b>phoneNumber</b></label>
    <input type="text" placeholder="Enter phoneNumber" name="phoneNumber" id="phoneNumber" required>
    
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>
    
    
    <label for="gender"><b>Gender</b></label>
    <select name="gender">
    	<option value="">please select one</option>
    	<option value="MALE">Male</option>
    	<option value="FEMALE">Female</option>
    	<option value="OTHER">Other</option>
    </select>
    	
    

    <label for="dateOfBirth"><b>Date Of Birth</b></label>
    <input type="date" placeholder="Enter Date Of Birth" name="dateOfBirth" id="dateOfBirth" required>

	 
    <label for="landmark"><b>landmark</b></label>
    <input type="text" placeholder="Enter landmark" name="landmark" id="landmark" required>
     
    <label for="city"><b>city</b></label>
    <input type="text" placeholder="Enter city" name="city" id="firstName" required>
    
      <label for="state"><b>state</b></label>
    <input type="text" placeholder="Enter state" name="state" id="state" required>
    
       <label for="country"><b>country</b></label>
    <input type="text" placeholder="Enter country" name="country" id="country" required>
    
    
       <label for="pincode"><b>pincode</b></label>
    <input type="text" placeholder="Enter pincode" name="pincode" id="pincode" required>
    
   <label for="aadharCardNumber"><b>aadharCardNumber</b></label>
    <input type="text" placeholder="Enter aadharCardNumber" name="aadharCardNumber" id="aadharCardNumber" required>
     
     <label for="panCardNumber"><b>panCardNumber</b></label>
    <input type="text" placeholder="Enter panCardNumber" name="panCardNumber" id="panCardNumber" required>
     
     <label for="drivingLicenseNumber"><b>drivingLicenseNumber</b></label>
    <input type="text" placeholder="Enter drivingLicenseNumber" name="drivingLicenseNumber" id="drivingLicenseNumber" required>
     
     <label for="passportNumber"><b>passportNumber</b></label>
    <input type="text" placeholder="Enter passportNumber" name="passportNumber" id="passportNumber" required>
     
     <label for="electionNumber"><b>electionNumber</b></label>
    <input type="text" placeholder="Enter electionNumber" name="electionNumber" id="electionNumber" required>
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form>
</body>
</html>