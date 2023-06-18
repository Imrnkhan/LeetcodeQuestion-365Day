package JavaGudia_Question;

import java.util.Random;

public class RendomNumber {
    public static void main(String[] args) {


        Random random = new Random();
//        int randomNumber = random.nextInt(); // Generates a random integer all any whare


        int randomNumber = random.nextInt(10) + 1; // Generates a random integer between 1 and 10 only

        System.out.println("Random Number: " + randomNumber);

    }
}
