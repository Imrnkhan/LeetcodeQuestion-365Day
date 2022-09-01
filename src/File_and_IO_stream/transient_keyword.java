package File_and_IO_stream;

//public class transient_keyword {
//}

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class transient_keyword implements Serializable {
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public transient_keyword(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }
}
class Main{

    public static void main(String args[])throws Exception{
        transient_keyword s1 =new transient_keyword(211,"ravi",22);//creating object
//writing object into file
        FileOutputStream f=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("success");
    }
}