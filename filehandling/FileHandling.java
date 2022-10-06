package filehandling;
import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) throws IOException {
        File obj= new File("notes.txt");
        try{
            obj.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("File created!");
    }
}
