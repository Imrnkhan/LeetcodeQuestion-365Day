package File_and_IO_stream;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

        public static void main(String[] args) throws IOException, IOException {
            FileReader fr=new FileReader("d://abc.txt");
            int i=fr.read();
            while( i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        }
    }

