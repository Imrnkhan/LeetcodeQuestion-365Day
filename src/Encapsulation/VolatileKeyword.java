package Encapsulation;

public class VolatileKeyword {

        private static volatile int counter = 0;

        private static class Player extends Thread {
            @Override
            public void run() {
                // Simulate some game events
                for (int i = 0; i < 10; i++) {
                    // Update the counter
                    counter++;
                    System.out.println("Player updated counter: " + counter);
                }
            }
        }

        public static void main(String[] args) {
            // Create multiple player threads
            Player player1 = new Player();
            Player player2 = new Player();

            player1.start();
            player2.start();
        }
    }


/*
The code you provided simulates a scenario where two player threads are incrementing
a shared counter variable, and both are trying to update it concurrently. The shared
counter variable is marked as volatile, which ensures that any changes made to the counter
 by one thread are immediately visible to all other threads.
 */