/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Tienda_IQ2023.Tienda_IQ2023.controller;

import com.Tienda_IQ2023.Tienda_IQ2023.domain.Cliente;
import com.Tienda_IQ2023.Tienda_IQ2023.service.ClienteService;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Fabricio Matarrita
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public String page(Model model) {
        log.info("Ahora utilizando MVC");
        /*String mensaje = "Estamos en semana 4, saludos!";
        model.addAttribute("MensajeSaludo", mensaje);
        
        Cliente cliente = new Cliente("Fabricio", "Matarrita", "gmail", "dos");
        Cliente cliente2 = new Cliente("Fabri", "Ramirez", "gmail", "dos");
        Cliente cliente3 = new Cliente("Juan", "Ramirez", "gmail", "dos");
        //model.addAttribute("cliente", cliente);
        
        List<Cliente> clientes = Arrays.asList(cliente,cliente2,cliente3);
        model.addAttribute("clientes", clientes);*/

        // var clientes = clienteDao.findAll();
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);

        return "index";
    }

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {
        return "modificarCliente";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarCliente";

    }
    
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente);
        return "redirect:/";
    }
}
