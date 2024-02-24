package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public void writeToFile(String filePath, String text) {
        Path path = Paths.get(filePath);
        try {
            byte[] bs = text.getBytes();
            Files.write(path, bs);
            System.out.println("Текст записано. Шлях до файлу: " + filePath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
