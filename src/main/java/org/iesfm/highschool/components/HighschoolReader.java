package org.iesfm.highschool.components;

import lombok.AllArgsConstructor;
import org.iesfm.highschool.entity.Group;
import org.iesfm.highschool.entity.Highschool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class HighschoolReader {
    private final static Logger log = LoggerFactory.getLogger(HighschoolReader.class);
    private Scanner scanner;
    private GroupReader groupReader;

    public Highschool readHighschool() {
        log.info("Introduce el nombre del instituto: ");
        String name = scanner.nextLine();
        log.info("Número de grupos: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        List<Group> groups = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            Group group = groupReader.readGroup();
            groups.add(group);
        }
        return new Highschool(name, groups);
    }
}
