package com.example.projectspring.controller;

import com.example.projectspring.entity.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class GeradorDeSalarios {
    public Salarios salarioProgramador() {
        Salarios salarios = new Salarios();
        salarios.setMeuSalarioDeProgramador(new BigDecimal("10.00"));
        return salarios;
    }

    public Salarios todosSalarios() {
        Salarios salarios = new Salarios(new BigDecimal("10.00"), new BigDecimal("20.00"));
        return salarios;
    }
}
