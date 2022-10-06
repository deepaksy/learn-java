package filehandling;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file = new File("notes.txt");
        if(file.delete()){
            System.out.println("Deleted: "+file.getName());
        }
        else{
            System.out.println("error deleting file!");
        }
    }
}
