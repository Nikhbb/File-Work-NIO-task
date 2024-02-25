package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public String writeToFile(String filePath, String text) {
        String result;
        Path path = Paths.get(filePath);
        try {
            byte[] bs = text.getBytes();
            Files.write(path, bs);
           result = "Текст записано. Шлях до файлу: " + filePath;
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }

}
