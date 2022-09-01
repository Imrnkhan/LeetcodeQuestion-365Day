package inheritance;

 class inheritance {
    float  salary =500;

}
class employee extends inheritance{
     int amount = 850;

    public static void main(String[] args) {
        inheritance t = new inheritance(); //parent

        employee em = new employee(); //child class

        System.out.println(em.amount);
        System.out.println(em.salary);

//if you are using the parent class only access parent class not child
        System.out.println(t.salary);

}
    }