package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWrite {
    public static void main(String[] args) {
        try{
        FileWriter myFileWriter =new FileWriter("notes.txt");
        myFileWriter.write("Hello world");
        myFileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
