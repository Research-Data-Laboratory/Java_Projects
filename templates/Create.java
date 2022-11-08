package createfile.templates;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Create {
    static String inputFileName, formattedDate;
    static File listOfFiles;
    public static void create() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formattedDate = time.format(formattedTime);

        Scanner inFileName =  new Scanner(System.in);
        System.out.print("\nFileName: ");
        inputFileName = inFileName.nextLine();
        listOfFiles = new File(inputFileName);
        try {
            if (listOfFiles.createNewFile()) {
                System.out.println("Created successfully at " + formattedDate);
            } else {
                System.out.println("File already Exist");
            }
        } catch (IOException e) {
            System.out.println("ERROR at Create File");
            e.printStackTrace();
        }
    }
}