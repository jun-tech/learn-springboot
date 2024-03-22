package org.juntech.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.juntech"})
public class JunTechApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunTechApplication.class,args);
    }
}
