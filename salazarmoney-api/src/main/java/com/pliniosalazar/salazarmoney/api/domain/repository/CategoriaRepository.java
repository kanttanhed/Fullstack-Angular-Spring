package com.pliniosalazar.salazarmoney.api.domain.repository;

import com.pliniosalazar.salazarmoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
