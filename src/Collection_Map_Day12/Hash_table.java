package Collection_Map_Day12;

import java.util.Hashtable;
import java.util.Map;

public class Hash_table {
    public static void main(String args[]){
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        System.out.println(hm);
        System.out.println(hm.get(101));
        hm.forEach((k,v)-> System.out.println(k+" "+v));

//        for(Map.Entry<Integer,String> m:hm.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());

//        }
    }
}
// ham es ko both string le sak te hi or many way to irratrate
//Hashtable: Synchronized, thread-safe, slower, does not allowed null -key  values.
