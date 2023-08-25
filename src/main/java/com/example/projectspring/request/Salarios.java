package com.example.projectspring.request;

import jakarta.ws.rs.core.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Salarios {
    private BigDecimal salaryDeveloper = new BigDecimal("2.500");

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
            path = "salarios-programador", produces = MediaType.APPLICATION_JSON)

    public ResponseEntity<?> getSalarysDevelopers() {
        System.out.println(salaryDeveloper);
        return new ResponseEntity<>(salaryDeveloper, HttpStatus.OK);
    }
}
