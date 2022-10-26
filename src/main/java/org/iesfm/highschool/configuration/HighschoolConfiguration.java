package org.iesfm.highschool.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.highschool.components.*;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class HighschoolConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public HighschoolReader highschoolReader(Scanner scanner, GroupReader groupReader) {
        return new HighschoolReader(scanner, groupReader);
    }

    @Bean
    public GroupReader groupReader(Scanner scanner, StudentReader studentReader) {
        return new GroupReader(scanner, studentReader);
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public HighschoolWriter highschoolWriter(
            ObjectMapper objectMapper,
            @Value("${output.path}") String path
    )  {
        return new HighschoolWriter(objectMapper, path);
    }

    @Bean
    public HighschoolProgram highschoolProgram(
            HighschoolReader  highschoolReader,
            HighschoolWriter  highschoolWriter
    ) {
        return new HighschoolProgram(highschoolReader, highschoolWriter);
    }

}