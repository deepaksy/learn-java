package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        File file =new File("notes.txt");
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
    }
}
