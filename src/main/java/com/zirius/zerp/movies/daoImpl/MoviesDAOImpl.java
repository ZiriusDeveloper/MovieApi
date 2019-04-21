package com.zirius.zerp.movies.daoImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zirius.zerp.movies.dao.MoviesDAO;
import com.zirius.zerp.movies.model.Movie;

@Repository
public class MoviesDAOImpl implements MoviesDAO {

	public static final Logger LOGGER = LoggerFactory.getLogger(MoviesDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Movie getMovieByTitle(String title, String year) {

		Movie movie = new Movie();
		Session session = sessionFactory.getCurrentSession();
		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Movie> cr = builder.createQuery(Movie.class);
			Root<Movie> root = cr.from(Movie.class);

			if (Optional.ofNullable(year).isPresent())
				cr.select(root).where(builder.equal(root.get("title"), title), builder.equal(root.get("year"), year));
			else
				cr.select(root).where(builder.equal(root.get("title"), title));
			movie = session.createQuery(cr).getSingleResult();

		} catch (HibernateException he) {
			LOGGER.error(he.getMessage());
		}
		return movie;
	}

	@Override
	public Boolean isMovieAlreadyPresent(String title, String year, String language) {
		Boolean isMovieAlreadyPresent = false;
		Session session = sessionFactory.getCurrentSession();
		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();

			CriteriaQuery<Movie> cr = builder.createQuery(Movie.class);

			Root<Movie> root = cr.from(Movie.class);

			cr.select(root).where(builder.equal(root.get("title"), title), builder.equal(root.get("year"), year),
					builder.equal(root.get("language"), language));
			List<Movie> results = session.createQuery(cr).getResultList();
			if (Optional.ofNullable(results).isPresent()) {
				isMovieAlreadyPresent = true;
			}
		} catch (HibernateException he) {
			LOGGER.error(he.getMessage());
		}
		return isMovieAlreadyPresent;
	}

	@Override
	public void saveMovie(Movie movie) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.saveOrUpdate(movie);
		} catch (HibernateException he) {
			LOGGER.error(he.getMessage());
		}
	}

	@Override
	public Movie findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		Movie movie = new Movie();
		try {
		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<Movie> cr = builder.createQuery(Movie.class);

		Root<Movie> root = cr.from(Movie.class);

		cr.select(root).where(builder.equal(root.get("id"), id));
		movie  = session.createQuery(cr).getSingleResult();
		}catch (HibernateException he) {
			LOGGER.error(he.getMessage());
		}
		return movie;
	}

}
