package com.amit.reactive.repository;

import com.amit.reactive.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}
