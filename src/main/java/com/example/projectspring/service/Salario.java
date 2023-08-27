package com.example.projectspring.service;

import com.example.projectspring.controller.GeradorDeSalarios;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Salario {
    @Autowired
    private GeradorDeSalarios geraSalario;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
            path = "salary-developer", produces = MediaType.APPLICATION_JSON)

    public ResponseEntity<?> getSalarioProgramador() {
        return new ResponseEntity<>(geraSalario.todosSalarios(), HttpStatus.OK);
    }
}
