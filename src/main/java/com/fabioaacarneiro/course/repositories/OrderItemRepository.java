/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabioaacarneiro.course.repositories;

import com.fabioaacarneiro.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fabio
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
