package com.lab;

import com.lab.controller.LabController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        LabController controller = context.getBean(LabController.class);

        controller.executeLab2();
    }
}
