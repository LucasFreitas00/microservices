package io.github.lucasdsf.repository;

import io.github.lucasdsf.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
