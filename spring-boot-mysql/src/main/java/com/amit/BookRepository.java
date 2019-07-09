package com.amit;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository
	extends CrudRepository<Book, Long> {

	
    List<Book> findByName(String name);

}
