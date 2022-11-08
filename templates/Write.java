package createfile.templates;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
     public static void write(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.print("Input to Store: ");
        input = in.nextLine();
        try {
            FileWriter writeToFile = new FileWriter(Create.listOfFiles.getName(), true);
            writeToFile.write(input + " [Created at " + Create.formattedDate + "]\n");
            System.out.println("Writing Successfully");
            writeToFile.close();
        } catch (IOException error) {
            System.out.println("ERROR at Writing");
            error.printStackTrace();
        }
    }
}