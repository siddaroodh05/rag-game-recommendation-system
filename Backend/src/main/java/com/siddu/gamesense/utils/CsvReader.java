package com.siddu.gamesense.utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

@Component
public class CsvReader {

    @Value("${data.path}")
    private String dataPath;

    public void read(
            String fileName,
            Consumer<CSVRecord> consumer
    ) throws IOException {

        Path path = Paths.get(dataPath, fileName);

        try (
                Reader reader = Files.newBufferedReader(
                        path,
                        StandardCharsets.UTF_8
                );

                CSVParser parser = CSVFormat.DEFAULT.builder()
                        .setHeader()
                        .setSkipHeaderRecord(true)
                        .build()
                        .parse(reader)
        ) {
            for (CSVRecord record : parser) {
                consumer.accept(record);
            }
        }
    }
}