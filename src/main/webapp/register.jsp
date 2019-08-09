<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>User Details</title>
	</head>
	<body>
		<div class='container'>
			<div>
				<table class='center'>
					<caption>User Registered</caption>
					<thead>
						<tr>
							<th>Name</th>
							<th>Password</th>
							<th>Email</th>
							<th>Gender</th>
							<th>Organization</th>
							<th>Language</th>
							<th>Comments</th>							
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${user.getUsername()}</td>
							<td>${user.getPassword()}</td>
							<td>${user.getEmail()}</td>
							<td>${user.getGender()}</td>
							<td>${user.getOrganization()}</td>
							<td>${user.getLanguage()}</td>
							<td>${user.getComments()}</td>
						</tr>					
					</tbody>
				</table>
				<c:out value="${username}"></c:out>
			</div>
		</div>
	</body>
</html>