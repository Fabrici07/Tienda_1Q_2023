/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_IQ2023.Tienda_IQ2023.service;

import com.Tienda_IQ2023.Tienda_IQ2023.domain.Articulo;
import java.util.List;

/**
 *
 * @author Fabricio Matarrita
 */
public interface ArticuloService {
    
    public List<Articulo> getArticulo(boolean activos);
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo); //Tanto para insertar como modificar un registro
    
    public void delete(Articulo articulo);
}
