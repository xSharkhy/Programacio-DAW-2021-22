package myPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class wishList {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String ch;
        while (true) {
            ch = sc.nextLine();
            switch (ch) {
                case "C", "c" -> createFile();
                case "W", "w" -> writeOnFile();
                case "exit", "Exit", "EXIT" -> System.exit(0);
                default -> System.out.println("Error");
            }
        }
    }

    private static void writeOnFile() {
        try {
            System.out.println("Insert the name and the extension for the file you'll write:");
            FileWriter myWriter = new FileWriter(sc.nextLine());
            System.out.println("Write:");
            myWriter.write(sc.nextLine());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void createFile() {
        try {
            System.out.println("Insert the name and the extension for the file you'll create:");
            File file = new File(sc.nextLine());
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
