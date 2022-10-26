package org.iesfm.highschool.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.iesfm.highschool.entity.Highschool;

import java.io.File;
import java.io.IOException;

@AllArgsConstructor
public class HighschoolWriter {
    private ObjectMapper objectMapper;
    private String outputPath;

    public void writeHighschool(Highschool highschool) throws IOException {
        objectMapper.writeValue(
                new File(outputPath),
                highschool
        );
    }
}