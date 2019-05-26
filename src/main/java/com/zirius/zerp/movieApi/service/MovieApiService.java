package com.zirius.zerp.movieApi.service;

import com.zirius.zerp.movieApi.feign.OMDBClient;
import com.zirius.zerp.movieApi.model.domain.Movie;
import com.zirius.zerp.movieApi.model.dto.MovieDto;
import com.zirius.zerp.movieApi.repository.*;
import com.zirius.zerp.movieApi.util.DomainPOJOMapper;
import com.zirius.zerp.tables.daos.*;
import com.zirius.zerp.tables.pojos.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.List;

@Service
public class MovieApiService {

    @Autowired
    private MovieSearchRepo movieSearchRepo;

    @Autowired
    private OMDBClient omdbClient;

    @Autowired
    private MovieCURDRepo moviesDao;

    @Autowired
    private GenresCURDRepo genresDao;

    @Autowired
    private MovieGenresCURDRepo movieGenresDao;

    @Autowired
    private DirestorsCURDRepo directorsDao;

    @Autowired
    private MovieDirectorsCURDRepo movieDirectorsDao;

    @Autowired
    private WriterCURDRepo writersDao;

    @Autowired
    private MovieWriterCURDRepo movieWritersDao;

    @Autowired
    private ActorCURDRepo actorsDao;

    @Autowired
    private MovieActorCURDRepo movieActorsDao;

    @Autowired
    private LanguageCURDRepo worldLanguagesDao;

    @Autowired
    private CountryCURDRepo worldCountriesDao;

    @Value("${app.omdb.apikey}")
    private String apikey;

    /**
     * Returns list of movies based on the filter paramters
     *
     * @param title  title of the movie
     * @param type type of the movie
     * @param year year of the release
     * @return
     */
    public List<Movie>  getMovieInfo( String title,
                                @NotNull String type,
                                @NotNull @Positive @Size(min=4,max=4) Integer year) {

        return movieSearchRepo.search(title,type,year);

    }

    /**
     * Returns list of movies based on the filter paramters
     *
     * @param title  title of the movie
     * @param type type of the movie
     * @param year year of the release
     * @return
     */
    public String  getOMDBMovieInfo( String title,
                                      @NotNull String type,
                                      @NotNull @Positive @Size(min=4,max=4) Integer year) {

        return omdbClient.get(apikey,title,type,year);

    }


    /**
     * save or update a new movie details into the db
     *
     * @param movie object
     * return id from the movie record
     */
    public Integer saveMovie(Movie movie) {

        boolean isNew = movie.getId() == null;

//        movieGenresDao.delete(movieGenresDao.fetchByMovieId(movie.getId()));
//        movieDirectorsDao.delete(movieDirectorsDao.fetchByMovieId(movie.getId()));
//        movieWritersDao.delete(movieWritersDao.fetchByMovieId(movie.getId()));
//        movieActorsDao.delete(movieActorsDao.fetchByMovieId(movie.getId()));

//        movie.getGenre()
//         .stream()
//         .forEach((genre)->DomainPOJOMapper.mapToMovieGenres(movie.getId(),genre));
//
//        movie.getDirector()
//                .stream()
//                .forEach((directors)->DomainPOJOMapper.mapToMovieDirectors(movie.getId(),directors));
//
//        movie.getWriter()
//                .stream()
//                .forEach(writers -> DomainPOJOMapper.mapToMovieWriters(movie.getId(),writers));
//
//        movie.getActor()
//                .stream()
//                .forEach(actors -> DomainPOJOMapper.mapToMovieActors(movie.getId(),actors));

        Movies movies = DomainPOJOMapper.mapToMoviesPOJO(movie);
        if(isNew) {
            moviesDao.insert(movies);
        } else {
            moviesDao.update(movies);
        }

        return movies.getId();
    }


}
