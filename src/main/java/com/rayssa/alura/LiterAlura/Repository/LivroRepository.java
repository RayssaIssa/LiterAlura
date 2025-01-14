package com.rayssa.alura.LiterAlura.Repository;

import com.rayssa.alura.LiterAlura.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Book, Long> {
}