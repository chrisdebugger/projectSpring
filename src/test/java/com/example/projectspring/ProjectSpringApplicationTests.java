package com.example.projectspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ProjectSpringApplicationTests {
private BigDecimal salaryDeveloper = new BigDecimal( "2.000");
    @Test
    void contextLoads() {
        System.out.println(salaryDeveloper);
    }

}
