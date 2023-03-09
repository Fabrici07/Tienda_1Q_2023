/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_IQ2023.Tienda_IQ2023.dao;

import com.Tienda_IQ2023.Tienda_IQ2023.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fabricio Matarrita
 */
public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}
