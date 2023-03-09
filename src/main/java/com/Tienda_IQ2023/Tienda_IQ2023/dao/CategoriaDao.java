/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_IQ2023.Tienda_IQ2023.dao;

import org.springframework.data.repository.CrudRepository;
import com.Tienda_IQ2023.Tienda_IQ2023.domain.Categoria;
/**
 *
 * @author Fabricio Matarrita
 */
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
