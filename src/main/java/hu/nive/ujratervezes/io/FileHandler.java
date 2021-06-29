package hu.nive.ujratervezes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public int sumIgnoreComments(String relativePath) {

        String line = "";
        int sum = 0;

        try (BufferedReader reader = Files.newBufferedReader(Path.of(relativePath))) {
            while ((line = reader.readLine()) != null) {

                char[] chars = line.toCharArray();
                if (chars[0] == '/' && chars[1] == '/') {
                    continue;
                }

                int number = Integer.parseInt(line);
                sum += number;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return sum;
    }

}
