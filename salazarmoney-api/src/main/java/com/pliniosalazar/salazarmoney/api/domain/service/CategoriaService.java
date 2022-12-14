package com.pliniosalazar.salazarmoney.api.domain.service;

import com.pliniosalazar.salazarmoney.api.domain.repository.CategoriaRepository;
import com.pliniosalazar.salazarmoney.api.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria Salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
