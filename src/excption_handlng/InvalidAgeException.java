package excption_handlng;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}


class Employee{
    public int getPension(int age,int sal)throws Exception
    {
        int pension = 0;
        if(age>45 && age <100){
            pension=(age * sal)/100;
        }
        else{
            InvalidAgeException ae=new InvalidAgeException("Invalid Age");
            throw ae;
        }
        return pension;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        Employee emp = new Employee();
        try {
            emp.getPension(age,salary);
        } catch (Exception e) {
//e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
