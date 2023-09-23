package com.example.demo2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student aissame = new Student(
                    "Aissame",
                    "a@gmail.com",
                    LocalDate.of(2000, 11, 6)
            );

            Student khaoula = new Student(
                    "Khaoula",
                    "k@gmail.com",
                    LocalDate.of(1998, 9, 6)
            );

            repository.saveAll(List.of(aissame, khaoula));

        };
    }

}
