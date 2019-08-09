<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>User Registration Form</title>
	</head>
	<body>
		<h2>User Registration Form</h2>
		<div class='container'>
			<div>
				<form method="get" action="/register">
					<div>
						<fieldset class='fieldset-auto-width'>
							<legend>Account Information</legend>
							Name: <input type="text" name="username" /><br />
							<br /> Password: <input type="password" name="password" /><br />
							<br /> Email: <input type="text" name="email" /><br />
							<br /> Gender: <input type="radio" name="gender" value="m" checked />Male
							<input type="radio" name="gender" value="f" />Female <br />
							<br /> Organization: <select name="org">
								<option value="Microsoft">Microsoft</option>
								<option value="Dell">Dell</option>
								<option value="HP">HP</option>
								<option value="Merit America">Merit America</option>
								<option value="Amway">Amway</option>
							</select>
						</fieldset>		
					</div>
					<div>
						<fieldset class='fieldset-auto-width'>
							<legend>Languages</legend>
							<input type="checkbox" name="language" value="java" checked />Java<input
								type="checkbox" name="language" value="c" />C/C++<input
								type="checkbox" name="language" value="cs" />C#<input
								type="checkbox" name="language" value="js" />Javascript<input
								type="checkbox" name="language" value="py" />Python
						</fieldset>		
					</div>
					<div>
						<fieldset class='fieldset-auto-width'>
							<legend>Comments</legend>
							<textarea rows="5" cols="30" name="comments">Enter your comments here...</textarea>
						</fieldset>		
					</div>
					<input type="hidden" name="secret" value="888" /><input type="submit"
						value="SEND" /><input type="reset" value="CLEAR" />
				</form>
				<form action="/all">
				<button id='btn_all' onclick='/all'>All Users</button>
				</form>			
			</div>
		</div>
	</body>
</html>