
package com.Tienda_IQ2023.Tienda_IQ2023.service;

import com.Tienda_IQ2023.Tienda_IQ2023.domain.Cliente;
import java.util.List;


public interface ClienteService {
    
    //Firma de los metodos !Examen
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente); //Tanto para insertar como modificar un registro
    
    public void delete(Cliente cliente);
    
}
