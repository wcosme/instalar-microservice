package br.com.instalar.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.instalar.bookservice.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
