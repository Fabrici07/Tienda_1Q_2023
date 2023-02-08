
package com.Tienda_IQ2023.Tienda_IQ2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 *
 * @author Fabricio Matarrita
 */
@Data
@Entity
@Table(name="cliente")
public class Cliente {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //Transforma en id_cliente
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {       
    }
    
    
    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }    
}
