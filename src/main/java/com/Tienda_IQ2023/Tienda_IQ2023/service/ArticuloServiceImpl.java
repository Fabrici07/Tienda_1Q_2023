/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda_IQ2023.Tienda_IQ2023.service;

import com.Tienda_IQ2023.Tienda_IQ2023.dao.ArticuloDao;
import com.Tienda_IQ2023.Tienda_IQ2023.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fabricio Matarrita
 */
@Service //IMPORTANTE TRAER ESTA ANOTACIÓN | LAS ANOTACIONES NO PUEDEN TENER SALTO DE LINEAS
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloDao articuloDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulo(boolean activos) {
        var lista = (List<Articulo>)articuloDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
       return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
       
    }

    @Override
    @Transactional(readOnly = true)
    public void save(Articulo articulo) {
      articuloDao.save(articulo);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Articulo articulo) {
        articuloDao.deleteById(articulo.getIdArticulo());
       
    }
    
    
}
