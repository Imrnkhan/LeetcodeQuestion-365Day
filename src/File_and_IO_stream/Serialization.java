package File_and_IO_stream;

import java.io.*;

public class Serialization implements Serializable {
    int i =10;
    public void funA(){
        System.out.println("inside funtion A...");
        System.out.println(i);
    }
}
class main{
    public static void main(String[] args) throws IOException {
        Serialization D = new Serialization();
        D.i=20;  //chnage state of object
        FileOutputStream fr = new FileOutputStream("d//file.tecxt");
        ObjectOutputStream os = new ObjectOutputStream(fr);
        os.writeObject(D);

        os.writeObject("wecome");  //string class obj
        os.writeObject(10);  //Autoboxing
        os.close();
        System.out.println("D object is serialised");
    }
}