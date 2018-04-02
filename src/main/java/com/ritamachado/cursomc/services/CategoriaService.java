package com.ritamachado.cursomc.services;


import com.ritamachado.cursomc.domain.Categoria;
import com.ritamachado.cursomc.repositories.CategoriaRepository;
import com.ritamachado.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    /**
     * This method finds an object by ID by accessing the repository. It throws an exception if object is not found.
     * @param id Identifier to fetch Object from DB through repository layer
     * @return Object that matches the required id or throws an exception if object is not found
     */
    public Categoria find(Integer id){

        //You action the find by id to the repository and it returns an optional object
        Optional<Categoria> obj = categoriaRepository.findById(id);

        //it returns an optional object and if not, it throws an exception by calling method orElseThrow that receives a function
        //that instantiates an exception. Here a lambda expression is used in which a function that doesn't receive any argument ( () ) returns (->)
        // the object (ObjectNotFoundException)
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

    }
}
