<%@ page language="java" contentType="text/html;charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1" isELIgnored="false" %>

<!--Note the name of prefix below.You may require to change it.Here we are using sf:form .So prefix name is chosen as sf -->
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- DOCTYPE html-->

<html>
	<!--Actual Form Code Below-->
	<!--  body bgcolor="lavender"-->
	<body style="background-color:lavendar">
	<center>
		<h1>Movie Ticket Booking</h1>
	
		<sf:form method="post" modelAttribute="ticket" action="calculateCost">
		<!-- sf:form method="post" action="submitlogin"-->
		<!-- sf:form method="post" action="submitlogin" has by default modelAttribute="command"-->
		<table>
			<tr>
				<td>
					<sf:label path="movieName">Movie Name</sf:label>
				</td>
				<td>
					<sf:input type="text" path="movieName"/>
				</td>
			</tr>
			
			<tr>
               <td><sf:label path = "circleType">Choose Circle:</sf:label></td>
               <td>
                  <sf:select path = "circleType">
                     <!-- sf:option value = "NONE" label = "King"/-->
                     <sf:options items = "${circleList}" />
                  </sf:select>     	
               </td>
            </tr> 
			
			<!-- tr>
				<td>
					<sf:label path="circleType">Choose Circle:</sf:label>
				</td>
				<td>
					<sf:input type="text" path="circleType"/>
				</td>
			</tr-->
			
			
			<tr>
				<td>
					<sf:label path="noOfTickets">Number of Tickets</sf:label>
				</td>
				<td>
					<sf:input type="number" min="0" path="noOfTickets"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<button type="submit">CalculateCost</button>
				</td>
			</tr>
		</table>
		</sf:form>
	</center>
	</body>
	
	
	
	
	
</html>



