package org.iesfm.highschool.components;

import lombok.AllArgsConstructor;
import org.iesfm.highschool.entity.Group;
import org.iesfm.highschool.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class GroupReader {

    private final static Logger log = LoggerFactory.getLogger(GroupReader.class);
    private Scanner scanner;
    private StudentReader studentReader;

    public Group readGroup() {
        log.info("Letra del grupo:");
        String letter = scanner.nextLine();
        log.info("Curso del grupo:");
        int courseNumber = scanner.nextInt();
        scanner.nextLine();
        List<Student> students = readStudents();
        return new Group(letter, courseNumber, students);
    }

    private List<Student> readStudents() {
        List<Student> students = new LinkedList<>();
        log.info("Número de estudiantes:");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            students.add(studentReader.readStudent());
        }
        return students;
    }
}