package File_and_IO_stream;

import java.io.FileWriter;
import java.io.IOException;

public class file_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d://abc.txt");
        fw.write(100);//d will be added
        fw.write("ramesh\nwelcome");
        fw.write("\n");
        fw.write("india");
        fw.write("\n");
        char ch[]={'a','b','c'};
        fw.write(ch);
        fw.flush();
        fw.close();
        System.out.println("done");
    }
}

//Output:
//        The above program will create a new file abc.txt inside the D:// drive and write
//        dramesh
//        welcome
//        india
//        abc
