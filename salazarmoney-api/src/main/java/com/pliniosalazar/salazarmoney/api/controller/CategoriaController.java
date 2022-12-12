package com.pliniosalazar.salazarmoney.api.controller;

import com.pliniosalazar.salazarmoney.api.model.Categoria;
import com.pliniosalazar.salazarmoney.api.domain.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listarTudo() {
      return categoriaRepository.findAll();
    }

}
