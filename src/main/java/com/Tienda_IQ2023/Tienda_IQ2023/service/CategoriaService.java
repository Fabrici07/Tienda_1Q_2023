
package com.Tienda_IQ2023.Tienda_IQ2023.service;

import com.Tienda_IQ2023.Tienda_IQ2023.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    public List<Categoria> getCategoria(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria); //Tanto para insertar como modificar un registro
    
    public void delete(Categoria categoria);
}
