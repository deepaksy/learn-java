package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriters {
    public static void main(String[] args) {
        try{
            FileWriter w = new FileWriter("myfile.txt");
            w.write("Files in java are seriously good!");
            w.close();
            System.out.println("Successfully writter in java!");
        }
        catch(IOException e){
            System.out.println("Error occured!");
            e.printStackTrace();
        }
    }
}
