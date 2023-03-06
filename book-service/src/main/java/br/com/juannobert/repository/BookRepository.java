package br.com.juannobert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juannobert.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
