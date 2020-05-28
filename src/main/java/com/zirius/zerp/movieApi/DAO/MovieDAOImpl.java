package com.zirius.zerp.movieApi.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.zirius.zerp.movieApi.Entities.CustomException;
import com.zirius.zerp.movieApi.Entities.Movie_Details;
import com.zirius.zerp.movieApi.Entities.ResponseBean;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Movie_Details> getMovies(String strType) {

		Session session = entityManager.unwrap(Session.class);
		List<Movie_Details> strTestMovieId = new ArrayList<Movie_Details>();
		try {
			System.out.println("Session:::"+session);
			List<Movie_Details> strQueryDetails = session
					.createQuery("from Movie_Details where Type like'%" + strType.toLowerCase() + "%'").getResultList();

			System.out.println("strQueryDetails:::"+strQueryDetails.size());
			if(strQueryDetails.size()>0)
			{
				System.out.println(strQueryDetails.get(0).getTitle());
				return strQueryDetails;
			}
			else {
				throw new CustomException(
				          "Data unavailable",
				          "No Data Available for type:::"+strType,
				          ""
				          );
				
			}
			

		} catch (Exception e) {
		} finally {
			session.close();
			entityManager.close();
			}
//		
		return null;
	}

	@Override
	public List<ResponseBean> saveMovie(Movie_Details cust) {

		Session session = entityManager.unwrap(Session.class);
		ResponseBean rd = new ResponseBean();
		List<ResponseBean> strResponseBean = new ArrayList<ResponseBean>();

		try {
			List<Movie_Details> strTestMovieId = session
					.createQuery("from Movie_Details where Title='" + cust.getTitle() + "'").getResultList();
			System.out.println("strTestMovieId:::" + strTestMovieId.size());
			if (strTestMovieId.size() > 0) {
				rd.setMovieId(Integer.toString(strTestMovieId.get(0).getId()));
				rd.setStatus(HttpStatus.ALREADY_REPORTED.toString());
				rd.setDescription("Records Already Available for Movie " + strTestMovieId.get(0).getTitle());

			} else {
				int id = (int) session.save(cust);
				rd.setMovieId(Integer.toString(id));
				rd.setStatus(HttpStatus.ACCEPTED.toString());
				rd.setDescription("Movie Records Inserted Successfully!!!");

			}
			System.out.println("Re----->" + strResponseBean.size());
			strResponseBean.add(rd);
			System.out.println("Re1----->" + strResponseBean.size());

		} catch (Exception e) {
			rd.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			rd.setDescription(e.getMessage());
			System.out.println("Re----->" + strResponseBean.size());
			strResponseBean.add(rd);
			System.out.println("Re1----->" + strResponseBean.size());
		} finally {
			session.close();
		}

		return strResponseBean;

//		Session session=sessionFactory.getCurrentSession();
//		session.saveOrUpdate(cust);
//		if(id>0)
//		{
//			System.out.println("Customer Added Successfully");
//		}
//		else {
//			System.out.println("An Error Occured... Kindly contact your Administrator!!!");
//		}

	}

	@Override

	public Movie_Details getMovie(int id) {
//		
//		Session session=sessionFactory.getCurrentSession();
//		
//		Customer strCustomer=session.get(Customer.class, id);
//		
		return null;
	}

	@Override
	public void deleteMovie(int id) {

//		Session session=sessionFactory.getCurrentSession();
//		Customer strDeleteCustomers=session.get(Customer.class, id);
//		session.delete(strDeleteCustomers);
		System.out.println("Customer " + id + " Deleted Successfully!!!");

	}

	@Override
	public List<Movie_Details> searchMovies(String MovieName, String Type, String Year) {

		Session session = entityManager.unwrap(Session.class);
		System.out.println("Session:::" + session);
		System.out.println("MovieName:::" + MovieName);
		if (Type.trim() != "" && Year.trim() != "") {
			System.out.println("Into Movie SearchMovie");
			Query<Movie_Details> strQueryDetails = session.createQuery(
					"from Movie_Details where " + "  type ='" + Type + "' and Year= '" + Year + "'",
					Movie_Details.class);

			List<Movie_Details> strTest = strQueryDetails.getResultList();
			return strTest;
		} else {
			return null;
		}

	}
	// title like '%"+MovieName+"%' or actors like '%"+MovieName+"%' or director
	// like '%"+MovieName+"%'

	@Override
	public List<ResponseBean> updateMovie(Movie_Details updateMovie) {
		Session session = entityManager.unwrap(Session.class);
		ResponseBean rd = new ResponseBean();
		List<ResponseBean> strResponseBean = new ArrayList<ResponseBean>();
		System.out.println("strTestMovieId:::");
		
		
		try {
			List<Movie_Details> strTestMovieId = session
					.createQuery("from Movie_Details where  id='"+updateMovie.getId()+"'").getResultList();
			System.out.println("strTestMovieId:::" + strTestMovieId.size());
			if (strTestMovieId.size() > 0) {
		
				session.merge(updateMovie);
				
				rd.setMovieId(Integer.toString(strTestMovieId.get(0).getId()));
				rd.setStatus(HttpStatus.ACCEPTED.toString());
				rd.setDescription("Records Updated Successfully for Movie " + strTestMovieId.get(0).getTitle());

			} else {
				rd.setStatus(HttpStatus.NOT_FOUND.toString());
				rd.setDescription("Records not available for Movie ");

			}
			strResponseBean.add(rd);
		
		}
		catch (Exception e) {
			rd.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			rd.setDescription(e.getMessage());
			strResponseBean.add(rd);
		} finally {
			session.close();
		}

		return strResponseBean;
//		return null;
	}

}
