
package com.Tienda_IQ2023.Tienda_IQ2023.service;

import com.Tienda_IQ2023.Tienda_IQ2023.dao.ClienteDao;
import com.Tienda_IQ2023.Tienda_IQ2023.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service //IMPORTANTE TRAER ESTA ANOTACIÓN | LAS ANOTACIONES NO PUEDEN TENER SALTO DE LINEAS
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    
    @Override
    @Transactional(readOnly = true) //Para manejar transacciones de solo lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();      
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
        

    @Override
    @Transactional // Los de modificacion solo transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);     
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
      
    }
    
}
