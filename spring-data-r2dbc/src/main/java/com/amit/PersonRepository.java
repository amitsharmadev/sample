package com.amit;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository
interface PersonRepository extends R2dbcRepository<Person, Integer> {
  @Query("SELECT * FROM people WHERE name = $1")
  public Flux<Person> findAllByName(String name);
  @Query("SELECT * FROM people WHERE age = $1")
  public Flux<Person> findAllByAge(Integer age);
  @Query("SELECT * FROM people")
  public Flux<Person> findAll();
}
