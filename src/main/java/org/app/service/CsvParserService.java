package org.app.service;

import org.app.dto.CsvLineDto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParserService {

    public List<CsvLineDto> csvParser(String pathFile) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(pathFile));

        List<CsvLineDto> result = new ArrayList<>();
        for (String currentLine : allLines.subList(1, allLines.size())) {
            String[] elements = currentLine.split(",");

            CsvLineDto csvLineDto = new CsvLineDto(elements[0], elements[1], elements[2], elements[3],
                    elements[4], elements[5], elements[6], elements[7]);

            result.add(csvLineDto);
        }


        return result;
    }
}
