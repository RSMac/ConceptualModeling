package com.ritamachado.cursomc.resources.exceptions;


import com.ritamachado.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * This class deals with Exceptions thrown by the Service classes to the Resources (REST Controllers) Classes
 */

@ControllerAdvice
public class ResourceExceptionHandler {

    /**
     * This is the standard signature for this notFound method in the Framework with annotation @ControllerAdvice
     * @param e Exception thown message and cause
     * @param request
     * @return
     */
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<SandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request){

        SandardError err = new SandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(),System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);


    }
}
