<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>
</head>
<body>
	<center>
		<h2>Add New Movie Data</h2>

		<form:form action="${pageContext.request.contextPath}/logout"
			method="POST">
			<input type="Submit" value="logout" style="float: right"
				class="btn btn-info">
		</form:form>

		<br>
	</center>
	<form:form action="/insertMovieDetails" method="Post"
		modelAttribute="movie_details">

		<div class="container">
			<div class="row">
				<div class="col-6 col-md-4">
					<label>Movie Title:</label>
					<form:input path="Title" class="form-control" />
				</div>
				<div class="col-6 col-md-4">
					<label>Year:</label>
					<form:input path="Year" class="form-control" />
				</div>
				<div class="col-6 col-md-4">
					<label>Rated:</label>
					<form:input path="Rated" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label>Released:</label>
					<form:input path="Released" class="form-control" />
				</div>
				<div class="col">
					<label>Runtime:</label>
					<form:input path="Runtime" class="form-control" />
				</div>
				<div class="col">
					<label>Genre:</label>
					<form:input path="Genre" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label>Director:</label>
					<form:input path="Director" class="form-control" />
				</div>
				<div class="col">
					<label>Writer:</label>
					<form:input path="Writer" class="form-control" />
				</div>
				<div class="col">
					<label>Actors:</label>
					<form:input path="Actors" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label>Plot:</label>
					<form:input path="Plot" class="form-control" />
				</div>
				<div class="col">
					<label>Language:</label>
					<form:input path="Language" class="form-control" />
				</div>
				<div class="col">
					<label>Country:</label>
					<form:input path="Country" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label>Awards:</label>
					<form:input path="Awards" class="form-control" />
				</div>
				<div class="col">
					<label>Poster Link:</label>
					<form:input path="Poster" class="form-control" />
				</div>
				<div class="col">
					<label>Metascore:</label>
					<form:input path="Metascore" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label>imdbRating:</label>
					<form:input path="imdbRating" class="form-control" />
				</div>
				<div class="col">
					<label>imdbVotes:</label>
					<form:input path="imdbVotes" class="form-control" />
				</div>
				<div class="col">
					<label>imdbID:</label>
					<form:input path="imdbID" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label>Type:</label>

					<form:select path="Type" class="browser-default custom-select">
					<option selected>Click here to choose type</option>
						<option value="Movie">Movie</option>
						<option value="series">series</option>
						<option value="Episode">Episodes</option>
					</form:select>
									</div>
				<div class="col">
					<label>DVD:</label>
					<form:input path="DVD" class="form-control" />
				</div>
				<div class="col">
					<label>BoxOffice:</label>
					<form:input path="BoxOffice" class="form-control" />
				</div>
			</div>
						<div class="row">
				<div class="col">
					<label>Production:</label>
					<form:input path="Production" class="form-control" />
				</div>
				<div class="col">
					<label>Website:</label>
					<form:input path="Website" class="form-control" />
				</div>
			</div>
		</div>
		<br>
		<center>
			<input type="submit" value="Add Entries" class="btn btn-success">
		</center>
	</form:form>
</body>
</html>