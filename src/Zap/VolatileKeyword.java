package Zap;

public class VolatileKeyword {
    private volatile int counter = 0;


    public int getCounter() {
        return counter;
    }

    public void increaseCounter(){
        counter++;      //increases the value of counter by 1
    }

    public static void main(String[] args) {
        VolatileKeyword vk = new VolatileKeyword();
             vk.increaseCounter();
        System.out.println(vk.getCounter());

        // use the instance of the class to access the volatile counter variable
    }
}






