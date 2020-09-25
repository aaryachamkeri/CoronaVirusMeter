<%@page import="com.cov19.model.Country"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	


<style>


	th, td{
		border : 1px solid black;	
	}
	
	table{
		background-color : pink;
	
	}
	
	
	
	

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<a href="/getCases">Home Page</a>
	<%!Country c;  %>
	<% c = (Country)request.getAttribute("country"); %>
	<h1><%= c.getCountry() %></h1>
	<table>
		<tr>
			<th>Country Name</th>
			<th>Cases</th>
			<th>New Cases</th>
			<th>Total Deaths</th>
			<th>New Deaths</th>
			<th>Recovered</th>
			<th>Active</th>
			<th>Critical</th>
			<th>Cases Per One Million</th>
			<th>Deaths Per One Million</th>
			<th>Total Tests</th>
			<th>Tests Per One Million</th>
			
		</tr>
		
		<tr>
			<tr>
				<td><%= c.getCountry()%></td>
				<td><%= c.getCases()%></td>
				
				
				<%if(c.getTodayCases() != 0){ %>
					<td><%= c.getTodayCases()%></td>
				<%} else{ %>
					<td><%= c.getTodayCases()%></td>
				<%} %>
				
				
				<td><%= c.getDeaths()%></td>
				
				
				<%if(c.getTodayDeaths() != 0){ %>
					<td><%= c.getTodayDeaths()%></td>
				<%} else{ %>
					<td><%= c.getTodayDeaths()%></td>
				<%} %>
				
				
				
				
				<td><%= c.getRecovered()%></td>
				<td><%= c.getActive()%></td>
				
				
				
				<%if(c.getCritical() != 0){ %>
					<td><%= c.getCritical()%></td>
				<%} else{ %>
					<td><%= c.getCritical()%></td>
				<%} %>
				
				
				
				
				<td><%= c.getCasesPerOneMillion()%></td>
				<td><%= c.getDeathsPerOneMillion()%></td>
				<td><%= c.getTotalTests()%></td>
				<td><%= c.getTestsPerOneMillion()%></td>
			</tr>
		
		</tr>
	
	</table>
</body>
</html>