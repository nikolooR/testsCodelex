package exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class ReverseFileContent {
    public static void reverseFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);
        Files.write(path, "".getBytes());
        Collections.reverse(lines);
        lines.forEach(line -> {
            try {
                Files.write(path,(new StringBuilder(line).reverse().toString() + "\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
