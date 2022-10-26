package org.iesfm.highschool.components;

import lombok.AllArgsConstructor;
import org.iesfm.highschool.entity.Highschool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@AllArgsConstructor
public class HighschoolProgram {
    private final static Logger log = LoggerFactory.getLogger(HighschoolProgram.class);
    private HighschoolReader highschoolReader;
    private HighschoolWriter highschoolWriter;

    public void execute() {
        try {
            Highschool highschool = highschoolReader.readHighschool();
            highschoolWriter.writeHighschool(highschool);
        } catch (IOException e) {
            log.error("Error al guardar el instituto", e);
        }
    }
}
