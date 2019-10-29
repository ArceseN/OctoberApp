package com.nadiaworks.demo.repositories;

import com.nadiaworks.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
