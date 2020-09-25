
<%@page import="java.text.NumberFormat"%>
<%@page import="com.cov19.model.Country"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>COVID-19</title>

<style>

	.button{
		border : none;
		padding : 8px;
		color : white;
		background-color: rgb(112, 224, 120);
		font-size: 18px;
		display: block;
		margin-right: auto;
		margin-left: auto;
		box-shadow: 10px 10px 5px grey;
		animation-name : example;
		animation-duration : 2s;
	}
	
	@keyframes example{
		from {background-color: red;}
		to {background-color: rgb(112, 224, 120);}
	
	}
	
	
	.table{
	
		
		background-color : rgb(0, 255, 255); 
		border-collapse: collapse;
		margin-left: auto;
  		margin-right: auto;
	
	}
	.table2{
		 height: 200px;
		border-collapse: collapse;
		align-items: center;
		margin-left: auto;
  		margin-right: auto;
  		background-color: white;
  		overflow-y: scroll;
  		box-shadow: 10px 10px 5px grey;

	
	}
	th, td{
		border : 1px solid rgb(215, 219, 213);
		border-collapse: collapse;
		font-size: 20px;
		/*font-family: Trebuchet MS;*/
		font-family : noto sans,sans-serif;
		color: maroon;
		padding: 8px;
	}
	.bad{
		background-color : rgb(252, 109, 83);
		border-collapse: collapse;
	}
	.good{
		background-color : rgb(212, 245, 188);
		border-collapse: collapse;
	
	}
	header{
		padding: 30px;
		background-color : black;
		color : white;
		text-align: center;
	}
	section{
		
	
	
	}

	
	body{
		margin-left: auto;
  		margin-right: auto;
  		background-image : url(Covid.jpg);
  		
	
	}
	label{
	    display: block;
	    text-align: center;
	    line-height: 150%;
	    font-size: .85em;
	}
	.table2 th{
		position: sticky;
	
	
	}



</style>
</head>
<body style="overflow-x:auto;">



	<%!
		
		List<Country> obj;
	%>
	<%
		obj = (List<Country>)request.getAttribute("Main Covid Object");
		NumberFormat myFormat = NumberFormat.getInstance();
	%>
	
	
	
	
	<header>
		<h1> Corona Virus Count by Country (Page Made by Aarya Chamkeri)</h1>
	
	
	</header>
	
	<br>
	<br>
	
	
	
	<article>
	
	
		<iframe src="https://www.youtube.com/embed/8OjXgF_kdtM" style="height:400px;width:600px;margin-left: auto;margin-right: auto;display:block;resize: auto;overflow:auto;"></iframe>
		
		
		<br>
		<br>
		<br>
			
		<form action="getByCountry">
			<input type = "text" name = "sbc" class = "button" id = "in">
			<label for="id">(Use dash for space eg : united-states)</label>
			<br>
			<br>
			<input type = "submit" value = "Search by Country" class = "button">
		
		</form>
		
		<br>
		
		<table class = "table">
			<tr>
				<th>Country Name    </th>
				<th>Cases</th>
				<th>New Cases</th>
				<th>Total Deaths</th>
				<th>New Deaths</th>
				<th>Recovered</th>
				<th>Active</th>
				<th>Critical</th>
				<th>Cases Per One Million</th>
				<th>Deaths Per One Million</th>
<%-- 	 		<tr>
				<td><%= gl.getNewConfirmed() %></td>
				<td><%= gl.getTotalConfirmed()%></td>
				<td><%= gl.getNewDeaths()%></td>
				<td><%= gl.getTotalDeaths()%></td>
				<td><%= gl.getNewRecovered()%></td>
				<td><%= gl.getTotalRecovered()%></td>
				--%>
				
			</tr> 
			
			<tr>
				<%Country con = obj.get(0); %>
				<td><%= con.getCountry()%></td>
				<td><%= myFormat.format(con.getCases())%></td>
				<td><%= myFormat.format(con.getTodayCases())%></td>
				<td><%= myFormat.format(con.getDeaths())%></td>
				<td><%= myFormat.format(con.getTodayDeaths())%></td>
				<td><%= myFormat.format(con.getRecovered())%></td>
				<td><%= myFormat.format(con.getActive())%></td>
				<td><%= myFormat.format(con.getCritical())%></td>
				<td><%= myFormat.format(con.getCasesPerOneMillion())%></td>
				<td><%= myFormat.format(con.getDeathsPerOneMillion())%></td>
				
			</tr>
	
		
		</table>
		
		<br>
		
		<table class = "table2">
			<tr>
				<th>Country Name</th>
				<th>Cases</th>
				<th class = "bad">New Cases</th>
				<th>Total Deaths</th>
				<th class = "bad">New Deaths</th>
				<th class = "good">Recovered</th>
				<th>Active</th>
				<th class = "bad">Critical</th>
				<th>Cases Per One Million</th>
				<th>Deaths Per One Million</th>
				<th>Total Tests</th>
				<th>Tests Per One Million</th>
				
<!-- 				<th>Country code    </th>
				<th class = "bad">New Confirmed    </th>
				<th>Total Confirmed    </th>
				<th class = "bad">New Deaths    </th>
				<th>Total Deaths    </th>
				<th class = "good">New Recovered    </th>
				<th class = "good">Total Recovered    </th> -->
				
			
			</tr>
			
			<%for(int i = 1; i < obj.size(); i++){ %>
				<%Country c = obj.get(i); %>
				<tr>
					<td><a href = "getByCountry?sbc=<%= c.getCountry()%>"><%= c.getCountry()%></a></td>
					
					<td><%= myFormat.format(c.getCases())%></td>
					
					
					<%if(c.getTodayCases() > 0){ %>
						<td class = "bad"><%= myFormat.format(c.getTodayCases())%></td>
					<%} else{ %>
						<td><%= c.getTodayCases()%></td>
					<%} %>
					
					
					<td><%= myFormat.format(c.getDeaths())%></td>
					
					
					<%if(c.getTodayDeaths() > 0){ %>
						<td class = "bad"><%= myFormat.format(c.getTodayDeaths())%></td>
					<%} else{ %>
						<td><%= c.getTodayDeaths()%></td>
					<%} %>
					
					
					
					<%if(c.getRecovered() > 0){ %>
						<td class = "good"><%= myFormat.format(c.getRecovered())%></td>
						
					<%} else{ %>
						<td><%= c.getRecovered()%></td>
					<%} %>
					
					
					<td><%= myFormat.format(c.getActive())%></td>
					
					
					
					<%if(c.getCritical() != 0){ %>
						<td class = "bad"><%= myFormat.format(c.getCritical())%></td>
					<%} else{ %>
						<td><%= c.getCritical()%></td>
					<%} %>
					
					
					
					
					<td><%= myFormat.format(c.getCasesPerOneMillion())%></td>
					<td><%= myFormat.format(c.getDeathsPerOneMillion())%></td>
					<td><%= myFormat.format(c.getTotalTests())%></td>
					<td><%= myFormat.format(c.getTestsPerOneMillion())%></td>
				</tr>
			<%} %>
			
<%-- 			<%for(int i = 1; i < obj.size(); i++){ %>
				<tr>
					<td><a href = "getByCountry?sbc=<%=obj.get(i).getCountry().toUpperCase()%>"><%= obj.getCountries().get(i).getSlug().toUpperCase() %></a></td>
	 				<td><%= obj.getCountries().get(i).getCountryCode()%></td>
					<td class = "bad"><%= obj.getCountries().get(i).getNewConfirmed()%></td>
					<td><%= obj.getCountries().get(i).getTotalConfirmed()%></td>
					<td class = "bad"><%= obj.getCountries().get(i).getNewDeaths()%></td>
					<td><%= obj.getCountries().get(i).getTotalDeaths()%></td>
					<td class = "good"><%= obj.getCountries().get(i).getNewRecovered()%></td>
					<td class = "good"><%= obj.getCountries().get(i).getTotalRecovered()%></td> 
				</tr>
				
			
			<%} %> --%>
		
		
		</table>
		
		<br>
		<br>
		<br>
		
		
		
	</article>
	
	<section>
	
	
	
	
	
	</section>
</body>
</html>