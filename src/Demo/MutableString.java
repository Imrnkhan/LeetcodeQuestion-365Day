package Demo;

//public class mutable_unmutable {
//}
public class MutableString
{
    public static void main (String[] args)
    {
        StringBuffer str1 = new StringBuffer("JavaGoal");
        StringBuilder str2 = new StringBuilder("Learning");

        System.out.println("Value of str1 before change :" + str1);
        System.out.println("Value of str2 before change :" + str2);

        str1.append(".com");
        str2.append(" website");

        System.out.println("Value of str1 after change :" + str1);
        System.out.println("Value of str2 after change :" + str2);
    }
}