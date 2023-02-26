/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabioaacarneiro.course.services.exceptions;

/**
 *
 * @author fabio
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. ID: " + id);
    }
    
    
}
