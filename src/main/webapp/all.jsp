<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>All Users</title>
	</head>
	<body>
		<div class='container'>
			<div>
				<table class='center'>
				<caption>All Registered Users</caption>
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
					<c:forEach items="${users}" begin="0" var="u">
						<tr>
							<td>${u.getUsername()}</td>
							<td>${u.getPassword()}</td>
							<td>${u.getEmail()}</td>
							<td>${u.getGender()}</td>
							<td>${u.getOrganization()}</td>
							<td>${u.getLanguage()}</td>
							<td>${u.getComments()}</td>
						</tr>
					</c:forEach>
					<tfoot >
						<tr>
							<td colspan='7'>Total users: <c:out value="${users.size()}" /></td>
						</tr>
					</tfoot>					
				</table>
			</div>
		</div>
	</body>
</html>

