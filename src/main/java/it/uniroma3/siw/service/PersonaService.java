package it.uniroma3.siw.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.uniroma3.siw.model.Movie;
import it.uniroma3.siw.repository.MovieRepository;

public class PersonaService {
	@Autowired MovieRepository movieRepository;
	
	public void inserisciPersona(Movie persona) {
		movieRepository.save(persona);
	} 
	
	public List<Movie> tutteLePersone() { 
	    List<Movie> all = new ArrayList<Movie>();
	    for (Movie p: movieRepository.findAll()) {
	        all.add(p);
	    }
	    return all;
	}
	
	public List<Movie> trovaPersonePerNome(int year) { 
	    List<Movie> trovate = new ArrayList<Movie>();
	    for (Movie p: movieRepository.findByYear(year)) {
	    	trovate.add(p);
	    }
	    return trovate;
	}

}
