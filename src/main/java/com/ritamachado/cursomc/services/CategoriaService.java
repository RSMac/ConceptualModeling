package com.ritamachado.cursomc.services;


import com.ritamachado.cursomc.domain.Categoria;
import com.ritamachado.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria fetch(Integer id){

        Optional<Categoria> obj = categoriaRepository.findById(id);

        return obj.orElse(null);

    }
}
