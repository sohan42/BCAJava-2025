package Unit8;

import java.io.File;
import java.io.IOException;

//Creating a File and Directory
public class FileDirectoryExample {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Creating a file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
        
        File directory = new File("NewDir");// Creating a directory
        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());
        } else {
            System.out.println("Directory already exists or could not be created.");
        }
    }
}
