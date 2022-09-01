package File_and_IO_stream;

import java.io.File;
import java.io.IOException;

public class create_file {
    public static void main(String[] args) {
        try {
            File fr = new File("abs.text");
if(fr.createNewFile()){
    System.out.println("file created..");
}
else {
    System.out.println("file alreday created..");
}
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
