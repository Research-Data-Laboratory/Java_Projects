package createfile.templates;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void read(){
        try {
            File readList = new File(Create.listOfFiles.getName());
            Scanner reader = new Scanner(readList);
            if (reader.hasNextLine()) {
                //String data = reader.nextLine();
                System.out.println("Read Successfully >>> " + readList.getName() + " <<<");
                System.out.println("Path: " + readList.getAbsolutePath());
                System.out.println("Writeable: " + readList.canWrite());
                System.out.println("Readable: " + readList.canRead());
                System.out.println("Size in Bytes: " + readList.length());
            } reader.close();
        } catch (FileNotFoundException er) {
            System.out.println("File not Found");
            er.printStackTrace();
        }
    }
}