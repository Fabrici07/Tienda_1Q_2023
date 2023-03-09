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
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);

        return "index";
    }

}
