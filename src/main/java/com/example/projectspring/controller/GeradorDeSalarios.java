package com.example.projectspring.controller;

import com.example.projectspring.entity.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class GeradorDeSalarios {
    public Salarios todosSalarios() {
        Salarios salarios = new Salarios();
        salarios.setMeuSalarioDeStreamer(new BigDecimal("10.00"));
        salarios.setMeuSalarioDeProgramador(new BigDecimal("15.00"));
        return salarios;
    }
}
