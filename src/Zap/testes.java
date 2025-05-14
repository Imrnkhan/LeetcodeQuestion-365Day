package Zap;

import java.util.*;

// Interface Building with required methods
interface Building {
    void floorCompleted(int floorNumber);
    void printStatus(int floorNumber);
    void printNumberOfFloors();
}

// School class implementing Building interface
class School implements Building {
    private int[] floors;

    // Constructor for School class
    School(int n) {
        floors = new int[n]; // Initialize floors array with size n
        for (int i = 0; i < n; i++) {
            floors[i] = 0; // Set all elements to 0, indicating no floors are completed
        }
        System.out.println("A school is being constructed");
    }

    // Marks the floor as completed in the school
    public void floorCompleted(int floorNumber) {
        if (floorNumber > 0 && floorNumber <= floors.length) {
            floors[floorNumber - 1] = 1; // Mark the floor as completed
            System.out.println("Construction for floor number " + floorNumber + " completed in school");
        } else {
            System.out.println("Floor number " + floorNumber + " does not exist in school");
        }
    }

    // Prints the status of the specified floor in the school
    public void printStatus(int floorNumber) {
        if (floorNumber > 0 && floorNumber <= floors.length) {
            if (floors[floorNumber - 1] == 1) {
                System.out.println("Construction for floor number " + floorNumber + " completed in school");
            } else {
                System.out.println("Construction for floor number " + floorNumber + " not completed in school");
            }
        } else {
            System.out.println("Floor number " + floorNumber + " does not exist in school");
        }
    }

    // Prints the number of floors in the school
    public void printNumberOfFloors() {
        System.out.println("The school has " + floors.length + " floors");
    }
}

// Hospital class implementing Building interface
class Hospital implements Building {
    private int[] floors;

    // Constructor for Hospital class
    Hospital(int n) {
        floors = new int[n]; // Initialize floors array with size n
        for (int i = 0; i < n; i++) {
            floors[i] = 0; // Set all elements to 0, indicating no floors are completed
        }
        System.out.println("A hospital is being constructed");
    }

    // Marks the floor as completed in the hospital
    public void floorCompleted(int floorNumber) {
        if (floorNumber > 0 && floorNumber <= floors.length) {
            floors[floorNumber - 1] = 1; // Mark the floor as completed
            System.out.println("Construction for floor number " + floorNumber + " completed in hospital");
        } else {
            System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        }
    }

    // Prints the status of the specified floor in the hospital
    public void printStatus(int floorNumber) {
        if (floorNumber > 0 && floorNumber <= floors.length) {
            if (floors[floorNumber - 1] == 1) {
                System.out.println("Construction for floor number " + floorNumber + " completed in hospital");
            } else {
                System.out.println("Construction for floor number " + floorNumber + " not completed in hospital");
            }
        } else {
            System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        }
    }

    // Prints the number of floors in the hospital
    public void printNumberOfFloors() {
        System.out.println("The hospital has " + floors.length + " floors");
    }
}

// Main Class to test the solution
public class testes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int schoolFloors = scanner.nextInt();
        int hospitalFloors = scanner.nextInt();
        scanner.nextLine(); // Consume newline after integers

        // Create instances of School and Hospital
        School school = new School(schoolFloors);
        Hospital hospital = new Hospital(hospitalFloors);

        // Testing the floorCompleted and printStatus methods for School
        String[] schoolCompletedFloors = scanner.nextLine().split(" ");
        for (String floor : schoolCompletedFloors) {
            school.floorCompleted(Integer.parseInt(floor));
        }

        // Testing the printStatus for School
        String[] schoolStatusFloors = scanner.nextLine().split(" ");
        for (String floor : schoolStatusFloors) {
            school.printStatus(Integer.parseInt(floor));
        }

        // Testing the floorCompleted and printStatus methods for Hospital
        String[] hospitalCompletedFloors = scanner.nextLine().split(" ");
        for (String floor : hospitalCompletedFloors) {
            hospital.floorCompleted(Integer.parseInt(floor));
        }

        // Testing the printStatus for Hospital
        String[] hospitalStatusFloors = scanner.nextLine().split(" ");
        for (String floor : hospitalStatusFloors) {
            hospital.printStatus(Integer.parseInt(floor));
        }

        // Print the number of floors for both buildings
        school.printNumberOfFloors();
        hospital.printNumberOfFloors();

        scanner.close();
    }
}
