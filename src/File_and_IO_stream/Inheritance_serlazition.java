package File_and_IO_stream;

//public class Inheritance_serlazition {
//}

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
    int i=10;
}
class Dogs extends Animal{
    int j=20;
}
class mains {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("file1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Dogs d = new Dogs();
        oos.writeObject(d);;
        System.out.println("done..");
    }
}