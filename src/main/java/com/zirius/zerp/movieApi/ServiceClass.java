package com.zirius.zerp.movieApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	@Autowired
	private Repo repository;

	public List<Model> getMovies(){
		return repository.findAll();
	}
	
	public String create(Model model) {
		List<Model> var = repository.findIdByImdbId(model.getImdbId());
		if (var.size() == 0){
			repository.save(model);
			return "saved successfully";
		}else {
			return "Imdb-Id already exist";
		}
	}

	public String update(Model model) {
		Model var = repository.findByImdbId(model.getImdbId());
		repository.delete(var);
		repository.save(model);
		return "updated successfully";
	}
}