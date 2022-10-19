package org.iesfm.highschool;


import org.iesfm.highschool.components.StudentReader;
import org.iesfm.highschool.configuration.HighSchoolConfiguration;
import org.iesfm.highschool.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                HighSchoolConfiguration.class
        );

        StudentReader studentReader = context.getBean(StudentReader.class);
        Student student = studentReader.readStudent();
        log.info(student.toString());

    }
}