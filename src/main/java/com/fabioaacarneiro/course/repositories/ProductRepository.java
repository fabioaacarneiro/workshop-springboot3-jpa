/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabioaacarneiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioaacarneiro.course.entities.Product;

/**
 *
 * @author fabio
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
