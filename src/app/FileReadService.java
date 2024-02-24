package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileReadService {
    public void readFromFile(String filePath) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filePath), UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (lines != null) {
            for (String s : lines) {
                System.out.println(s);
            }
        } else {
            System.out.println("Текст відсутній.");
        }

    }
}
