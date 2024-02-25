package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileReadService {
    public String readFromFile(String filePath) {
        String result = "";
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filePath), UTF_8);
        } catch (IOException e) {
            result = e.getMessage();
        }

        if (lines != null) {
            for (String s : lines) {
                result = s;
            }
        } else {
            result = "Текст відсутній.";
        }
        return result;
    }
}
