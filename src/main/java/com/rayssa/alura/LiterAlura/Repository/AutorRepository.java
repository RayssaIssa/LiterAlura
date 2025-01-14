package com.rayssa.alura.LiterAlura.Repository;

import com.rayssa.alura.LiterAlura.Model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Authors, Long> {
}
