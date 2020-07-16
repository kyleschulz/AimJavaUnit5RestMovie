package org.aim.movie;

import org.springframework.data.repository.CrudRepository;

import org.aim.movie.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
