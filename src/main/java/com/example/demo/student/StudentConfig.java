package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "maira.jamal@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 15)

            );
            repository.saveAll(
                    List.of(maria, alex)
            );

        };
    }
}
