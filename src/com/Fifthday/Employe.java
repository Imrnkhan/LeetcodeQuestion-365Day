package com.Fifthday;

public class Employe {

    private int EmployeId;
    private String EmployeName;
    private double salary;
    private double netSalery;


    public Employe(){

// ero argument constructor


    }

    // patameterized constructor

    public Employe(int EmployeId,String EmployeName,double salary){
        super();

        this.EmployeId = EmployeId;
        this.EmployeName= EmployeName;
        this.salary= salary;

    }
    // getter and setter

    public int getEmployeId(){
        return EmployeId;
    }
    public void setEmployeId(int EmployeId){
        this.EmployeId= EmployeId;

    }
    public String getEmployeName(){
        return EmployeName;
    }




    public void setEmployeName(String EmployeName){
        this.EmployeName= EmployeName;

    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary= salary;
    }
    public double getnetSalery(){
        return netSalery;
    }
    public void setnetSalery(double netSalery){
        this.netSalery= netSalery;
    }
    public static int getPFpersentage(Employe e){
        return(int)(Math.round((1-(e.netSalery/e.salary))*100));
    }
    public void calculatenetSalery(int PFpersentage){
        double finalSalary = getsalary()-((getsalary())*PFpersentage)/100;
        netSalery= finalSalary;
        // System.out.println(this.netSalery);
    }
    public static Employe getEmployeDetails(int EmployeId,String EmployeName,double salary){
        Employe em = new Employe(EmployeId,EmployeName,salary);
        return em;
    }

}
