package org.iesfm.highschool.components;

import org.iesfm.highschool.entity.Group;
import org.iesfm.highschool.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GroupReader {
    private final static Logger log = LoggerFactory.getLogger(StudentReader.class);

    private Scanner scanner;
    private StudentReader studentReader;

    public GroupReader(Scanner scanner, StudentReader studentReader) {
        this.scanner = scanner;
        this.studentReader = studentReader;
    }

    public GroupReader(Scanner scanner) {

    }


    public Group groupReader() {
        log.info("Introduce la letra:");
        String letra = scanner.nextLine();
        log.info("Introduce el curso:");
        int curso = scanner.nextInt();
        List<Student> students = new LinkedList<>();
        log.info("Introduce el numero de estudiantes:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numero; i++) {
            students.add(studentReader.readStudent());
        }
        return new Group(letra, curso, students);
    }
}
