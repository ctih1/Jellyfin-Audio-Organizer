package xyz.cthi1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static int files;
    static int completed;

    public static void main(String[] args) {
        Path basePath;
        System.out.println("Input the base path where artist folders will be created.");
        Scanner scanner = new Scanner(System.in);
        basePath = Paths.get(scanner.nextLine());
        scanner.close();
        float percent;

        Songs songs = new Songs(basePath);
        for(File file: songs.Get()) {
            System.out.printf(String.format("> Sorting song: [%s]...",file.getName()));
            try {
                new Sort(Path.of(file.getAbsolutePath()), basePath);
                System.out.printf(" SUCCESS");
            }
            catch (Exception e) {
                System.out.printf(" FAILED");
                System.out.println("!!! Ignoring exception: " + e + " !!!");
            }
            percent = ((float) completed /files)*100;
            System.out.println(" "+percent + "% | " + completed + "/" + files);
        }
    }
}