/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda_IQ2023.Tienda_IQ2023.service;

import com.Tienda_IQ2023.Tienda_IQ2023.dao.CategoriaDao;
import com.Tienda_IQ2023.Tienda_IQ2023.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service //IMPORTANTE TRAER ESTA ANOTACIÓN | LAS ANOTACIONES NO PUEDEN TENER SALTO DE LINEAS
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategoria(boolean activos) {
        var lista = (List<Categoria>)categoriaDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
       
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
       
    }

    @Override
    @Transactional(readOnly = true)
    public void save(Categoria categoria) {
      categoriaDao.save(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Categoria categoria) {
        categoriaDao.deleteById(categoria.getIdCategoria());
       
    }
    
    
}

    
    
    
   


    

