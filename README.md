# MovieApi

####Pre-requisite

	All the queries required are available in moviedb.sql. Please execute it in you mysql DB and create it. Please go through the connection properties in the application.properties and then change it as per your local configuration, if required. This configuration is common for all APIs

### Authentication Services	implemented using JWT :

1) SignUp Service : create the Application User
	
	curl --location --request POST 'http://localhost:8080/api/auth/signup' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "admin",
    "password": "nimda@123",
    "name": "administrator"
}'


2) SignIn Service : create Authorization for user Response with JWT

curl --location --request POST 'http://localhost:8080/api/auth/signin' \
--header 'Content-Type: application/json' \
--data-raw '{"userName":"admin","password":"nimda@123"}'

Sample Response :
{
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU4Mzc1NTgzNywiZXhwIjoxNTgzODQyMjM3fQ.BArg1OSzpdmldqI9jrLlFBX8VFb0bHF1pWreoQjwH6gsfT2e4v_JpsyQIRERVH9M0jJjwgIciCf8ixKJW4358A",
    "tokenType": "Bearer"
}



### Application End Points 

1) Create Movie Details API with Authorization and property validition:

   curl --location --request POST 'http://localhost:8080/movie/create' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU4Mzc1NTgzNywiZXhwIjoxNTgzODQyMjM3fQ.BArg1OSzpdmldqI9jrLlFBX8VFb0bHF1pWreoQjwH6gsfT2e4v_JpsyQIRERVH9M0jJjwgIciCf8ixKJW4358A' \
--header 'Content-Type: application/json' \
--data-raw '{
            "title": "Guardians of the Galaxy Vol. 2",
            "year": "2017",
            "type": "movie",
            "rated": "PG-13",
            "runtime": "136 min",
            "genre": "Action, Adventure, Drama, Sci-Fi",
            "director": "Richard Donner",
            "country": "USA, UK, Canada, Switzerland",
            "language": "English"
        }'



  Sample Response :
  {
    "status": "200",
    "message": "Movie Details created",
    "data": {
        "id": 7,
        "title": "Guardians of the Galaxy Vol. 2",
        "year": "2017",
        "type": "movie",
        "rated": "PG-13",
        "runtime": "136 min",
        "genre": "Action, Adventure, Drama, Sci-Fi",
        "director": "Richard Donner",
        "country": "USA, UK, Canada, Switzerland",
        "language": "English"
    }
}


2) Update Movie Details API With Authorization and property validition:

curl --location --request PUT 'http://localhost:8080/movie/update' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU4Mzc1NTgzNywiZXhwIjoxNTgzODQyMjM3fQ.BArg1OSzpdmldqI9jrLlFBX8VFb0bHF1pWreoQjwH6gsfT2e4v_JpsyQIRERVH9M0jJjwgIciCf8ixKJW4358A' \
--header 'Content-Type: application/json' \
--data-raw '{
	"id":2,
	"title": "Superman",
	"year": "1978",
	"rated": "PG",
	"released": "15 Dec 1978",
	"runtime": "150 min",
	"genre": "Action, Adventure, Drama, Sci-Fi",
	"director": "Richard Donner",
	"Writer": "Jerry Siegel (character created by: Superman), Joe Shuster (character created by: Superman), Mario Puzo (story), Mario Puzo (screenplay), David Newman (screenplay), Leslie Newman (screenplay), Robert Benton (screenplay)",
	"Actors": "Marlon Brando, Gene Hackman, Christopher Reeve, Ned Beatty",
	"Plot": "Just before the destruction of the planet Krypton, scientist Jor-El sends his infant son Kal-El on a spaceship to Earth. Raised by kindly farmers Jonathan and Martha Kent, young Clark discovers the source of his superhuman powers and moves to Metropolis to fight evil. As Superman, he battles the villainous Lex Luthor, while, as novice reporter Clark Kent, he attempts to woo co-worker Lois Lane",
	"language": "English",
	"country": "USA, UK, Canada, Switzerland",
	"Awards": "Nominated for 3 Oscars. Another 17 wins & 18 nominations.",
	"Poster": "https://m.media-amazon.com/images/M/MV5BMzA0YWMwMTUtMTVhNC00NjRkLWE2ZTgtOWEzNjJhYzNiMTlkXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SX300.jpg",
	"Ratings": [{
		"Source": "Internet Movie Database",
		"Value": "7.3/10"
	}, {
		"Source": "Rotten Tomatoes",
		"Value": "94%"
	}, {
		"Source": "Metacritic",
		"Value": "80/100"
	}],
	"Metascore": "80",
	"imdbRating": "7.3",
	"imdbVotes": "152,523",
	"imdbID": "tt0078346",
	"type": "movie",
	"DVD": "01 May 2001",
	"BoxOffice": "N/A",
	"Production": "Warner Bros. Pictures",
	"Website": "N/A",
	"Response": "True"
}'


Sample Response : 
{
    "status": "200",
    "message": "Movie Details Created nor Updated",
    "data": {
        "id": 2,
        "title": "Superman",
        "year": "1978",
        "type": "movie",
        "rated": "PG",
        "runtime": "150 min",
        "genre": "Action, Adventure, Drama, Sci-Fi",
        "director": "Richard Donner",
        "country": "USA, UK, Canada, Switzerland",
        "language": "English"
    }
}
    
3) Read the movie details using type and year  With Authorization and property validition: 

curl --location --request GET 'http://localhost:8080/movie/read' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU4Mzc1NTgzNywiZXhwIjoxNTgzODQyMjM3fQ.BArg1OSzpdmldqI9jrLlFBX8VFb0bHF1pWreoQjwH6gsfT2e4v_JpsyQIRERVH9M0jJjwgIciCf8ixKJW4358A' \
--header 'Content-Type: application/json' \
--header 'type: movie' \
--header 'year: 1978' \
--data-raw ''

Sample Response :
{
    "status": "200",
    "message": "",
    "data": [
        {
            "id": 2,
            "title": "Superman",
            "year": "1978",
            "type": "movie",
            "rated": "PG",
            "runtime": "150 min",
            "genre": "Action, Adventure, Drama, Sci-Fi",
            "director": "Richard Donner",
            "country": "USA, UK, Canada, Switzerland",
            "language": "English"
        }
    ]
}


4)Read Data for Public API Provider With Authorization and property validition:

curl --location --request GET 'http://localhost:8080/movie/publicapi/read' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU4Mzc1NTgzNywiZXhwIjoxNTgzODQyMjM3fQ.BArg1OSzpdmldqI9jrLlFBX8VFb0bHF1pWreoQjwH6gsfT2e4v_JpsyQIRERVH9M0jJjwgIciCf8ixKJW4358A' \
--header 'Content-Type: application/json' \
--header 'type: movie' \
--header 'year: 2000' \
--data-raw ''


Sample Response :
{
    "status": "200",
    "message": "",
    "data": {
        "imdbRating": "7.6",
        "imdbVotes": "522,765",
        "imdbID": "tt3896198",
        "dvd": "22 Aug 2017",
        "Title": "Guardians of the Galaxy Vol. 2",
        "Year": "2017",
        "Rated": "PG-13",
        "Released": "05 May 2017",
        "Runtime": "136 min",
        "Genre": "Action, Adventure, Comedy, Sci-Fi",
        "Director": "James Gunn",
        "Writer": "James Gunn, Dan Abnett (based on the Marvel comics by), Andy Lanning (based on the Marvel comics by), Steve Englehart (Star-Lord created by), Steve Gan (Star-Lord created by), Jim Starlin (Gamora and Drax created by), Stan Lee (Groot created by), Larry Lieber (Groot created by), Jack Kirby (Groot created by), Bill Mantlo (Rocket Raccoon created by), Keith Giffen (Rocket Raccoon created by), Steve Gerber (Howard the Duck created by), Val Mayerik (Howard the Duck created by)",
        "Actors": "Chris Pratt, Zoe Saldana, Dave Bautista, Vin Diesel",
        "Plot": "The Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.",
        "Language": "English",
        "Country": "USA",
        "Awards": "Nominated for 1 Oscar. Another 14 wins & 52 nominations.",
        "Poster": "https://m.media-amazon.com/images/M/MV5BNjM0NTc0NzItM2FlYS00YzEwLWE0YmUtNTA2ZWIzODc2OTgxXkEyXkFqcGdeQXVyNTgwNzIyNzg@._V1_SX300.jpg",
        "Ratings": [
            {
                "source": null,
                "value": null,
                "additionalProperties": {}
            },
            {
                "source": null,
                "value": null,
                "additionalProperties": {}
            },
            {
                "source": null,
                "value": null,
                "additionalProperties": {}
            }
        ],
        "Metascore": "67",
        "Type": "movie",
        "DVD": "22 Aug 2017",
        "BoxOffice": "$389,804,217",
        "Production": "Walt Disney Pictures",
        "Website": "N/A",
        "Response": "True",
        "AdditionalProperties": {}
    }
}
