package File_and_IO_stream;

import java.io.IOException;
import java.io.PrintWriter;

public class print_Writer {

        public static void main(String[] args) throws IOException {
//FileWriter fw=new FileWriter("abc.txt",true);
//PrintWriter out=new PrintWriter(fw);
//or
            PrintWriter out=new PrintWriter("d://abc.txt");
            out.write(100);//d will be added
            out.println(100);
            out.println(true);
            out.println('c');
            out.println("amit");
            out.flush(); //need not call the flush method
            out.close();
            System.out.println("done..");
        }
    }

