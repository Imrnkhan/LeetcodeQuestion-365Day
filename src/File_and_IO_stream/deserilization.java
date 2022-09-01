package File_and_IO_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserilization {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("file1.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();
//        M a1=(M)obj;
        deserilization B =  (deserilization)obj;
        String ss=(String)ois.readObject();
        System.out.println(ss);
        int z=(Integer)ois.readObject();
        System.out.println(z);
        ois.close();
    }
}

