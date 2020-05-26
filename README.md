# MovieApi

This application consist of four RestFull services

1.Create a movie
2.Update a movie
3.List movies from DB
4.List movies from public API


##Note

```
Every request is authenticated, Please use the below credentials

User - admin
Password - admin@123

```

 
##Create a movie

```
This API will add a new movie to DB

http://localhost:8080/movies/omdblist/create

Sample post request

{
	"title" : "Batman",
	"type" : "movie",
	"year" : "1994",
	"poster" : "test"
}

```

##Update a movie

```
This API will update movie to DB

http://localhost:8080/movies/omdblist/update

Sample post request

{
	"id" : 1,
	"title" : "Batman",
	"type" : "movie",
	"year" : "1994",
	"poster" : "test"
}

```

##Read a movies from DB

```
This API will read movie to DB

http://localhost:8080/movies/list

```

##Read a movies from public API

```
This API will read movie to DB

http://localhost:8080/movies/omdblist

```


