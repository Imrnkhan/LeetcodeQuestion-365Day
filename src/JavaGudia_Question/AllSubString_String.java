package JavaGudia_Question;

public class AllSubString_String {
    public static void main(String[] args) {
        String str = "abc";
        test(str);

    }
    public static void  test(String str){
        for(int i =0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}


// use all of the start and every element incresenig order and cover all element and again
// start next element when its end
//subarrays are used in the context of arrays and substring in the context of strings
/*
a  -1
ab - 1 2
abc -1 2 3
b    -2
bc  -2 3
c    -3
 */

/*
1
1 2
1 2 3
2
2 3
3
 */