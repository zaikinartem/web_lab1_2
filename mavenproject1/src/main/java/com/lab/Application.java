package com.lab;

import com.lab.controller.LabController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Главный класс приложения.
 * Запускает Spring Boot контекст и инициирует выполнение лабораторной работы.
 * 
 * @author User
 * @version 1.0
 */
@SpringBootApplication
public class Application {

    /**
     * Точка входа в приложение.
     * Запускает Spring Boot, получает бин контроллера и выполняет задание №2.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        LabController controller = context.getBean(LabController.class);
        controller.executeLab2();
    }
}