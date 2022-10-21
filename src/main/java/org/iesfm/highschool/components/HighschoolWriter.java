package org.iesfm.highschool.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.iesfm.highschool.entity.Highschool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
@AllArgsConstructor
public class HighschoolWriter {


        private ObjectMapper objectMapper;
        private String path;
        public void writeHighscool(Highschool highschool) throws IOException, IOException {

            objectMapper.writeValue(new File(path), highschool);
        }
    }