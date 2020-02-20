# MovieApi

#####Pre-requisite

		All the queries required are available in moviedb.sql. Please execute it in you mysql DB and create it. Please go through the connection properties in the application.properties and then change it as per your local configuration, if required. This configuration is common for all APIs.
		
		
#####HealthCheck

	http://localhost:80/
	Note : 80 is the port number configured for all the APIs.

####There are 4 APIs designed as given below

#####1. Read data from Movies database 

	This API will fetch the data from MOVIE_DETAILS table. Below is the endpoint.Try to hit it, provided you execute the queries from moviedb.sql
	
	Http://localhost:80/movie/read/
	
	Remember to add the basic http auth in the header for spring security as below
	Key: Authorization   value: Basic YWRtaW46cGFzc3dvcmQ=
	
#####2. Read data from external API

	This API will fetch data from external public API.Below is the endpoint.
	
	http://localhost:80/omdb/read
	
	Same http basic auth 	
		
#####3. Add movie data to DB

	This API will add data to DB.Below is the endpoint.
	
	http://localhost:80/movie/create
	
	Sample post request
	
	{
    "id": 2,
	"movie_name": "The park",
	"release_year":"2012",
	"movie_type":"Movie",
    "rating": "2"
	}

#####4. Update movie data in DB

	This API will update data in DB.Below is the endpoint.
	
	http://localhost:80/movie/update
	
	Sample post request
	
	{
	    "id": 1,
		"movie_name": "Master",
		"release_year":"2020",
		"movie_type":"Movie",
	    "rating": "5"
	} 
####Other implementations

	Validations - Spring bean validtions, used the class CustomGlobalExceptionHandler.java for custom validation.
	
	Security - Used the class SecurityConfig.java for basic http security.
	
####Refinement to be done

	1.Update request to accept list of movie details
	2.Junit tests
	3.The request to accept multiple request param, if required.
	4.Address the comments, if any.
	