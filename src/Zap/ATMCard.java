package Zap;


import java.util.Scanner;

// State interface
interface ATMState {
    void insertCard();
    void enterPIN(int pin);
    void requestCash(int amount);
    void deposit(int amount);
    void checkBalance();
    void logout();
}

// Concrete state classes
class NoCardState implements ATMState {
    public void insertCard() {
        System.out.println("Card inserted.");
        // Transition to the CardPresentState
        ATMMachine.setCurrentState(ATMMachine.getCardPresentState());
    }

    public void enterPIN(int pin) {
        System.out.println("Please insert a card first.");
    }

    public void requestCash(int amount) {
        System.out.println("Please insert a card first.");
    }

    public void deposit(int amount) {
        System.out.println("Please insert a card first.");
    }

    public void checkBalance() {
        System.out.println("Please insert a card first.");
    }

    public void logout() {
        System.out.println("No card to logout.");
    }
}

class CardPresentState implements ATMState {
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void enterPIN(int pin) {
        if (pin == 1234) {
            System.out.println("PIN correct. You are now logged in.");
            // Transition to the PinValidatedState
            ATMMachine.setCurrentState(ATMMachine.getPinValidatedState());
        } else {
            System.out.println("Incorrect PIN. Login failed.");
            // Transition to the NoCardState
            ATMMachine.setCurrentState(ATMMachine.getNoCardState());
        }
    }

    public void requestCash(int amount) {
        System.out.println("Please enter your PIN first.");
    }

    public void deposit(int amount) {
        System.out.println("Please enter your PIN first.");
    }

    public void checkBalance() {
        System.out.println("Please enter your PIN first.");
    }

    public void logout() {
        System.out.println("You are not logged in.");
    }
}

class PinValidatedState implements ATMState {
    private int balance;

    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void enterPIN(int pin) {
        System.out.println("PIN already entered and validated.");
    }

    public void requestCash(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Success: Cash dispensed: $" + amount);
        }
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Success: Deposit made: $" + amount);
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void logout() {
        System.out.println("Logout successful.");
        // Transition to the NoCardState
        ATMMachine.setCurrentState(ATMMachine.getNoCardState());
    }
}

// Context class
class ATMMachine {
    private static ATMState currentState;
    private static ATMState noCardState;
    private static ATMState cardPresentState;
    private static ATMState pinValidatedState;

    public ATMMachine() {
        noCardState = new NoCardState();
        cardPresentState = new CardPresentState();
        pinValidatedState = new PinValidatedState();

        currentState = noCardState;
    }

    public static void setCurrentState(ATMState state) {
        currentState = state;
    }

    public static ATMState getNoCardState() {
        return noCardState;
    }

    public static ATMState getCardPresentState() {
        return cardPresentState;
    }

    public static ATMState getPinValidatedState() {
        return pinValidatedState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void enterPIN(int pin) {
        currentState.enterPIN(pin);
    }

    public void requestCash(int amount) {
        currentState.requestCash(amount);
    }

    public void deposit(int amount) {
        currentState.deposit(amount);
    }

    public void checkBalance() {
        currentState.checkBalance();
    }

    public void logout() {
        currentState.logout();
    }
}

// Main class to test the ATM
public class ATMCard {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        Scanner scanner = new Scanner(System.in);

        // Simulate ATM operations
        System.out.println("Welcome to the ATM. Please insert your card.");
        atmMachine.insertCard();

        System.out.println("Please enter your PIN:");
        int pin = scanner.nextInt();
        atmMachine.enterPIN(pin);

        System.out.println("Enter the amount of cash to withdraw:");
        int amount = scanner.nextInt();
        atmMachine.requestCash(amount);

        System.out.println("Enter the amount of cash to deposit:");
        int depositAmount = scanner.nextInt();
        atmMachine.deposit(depositAmount);

        System.out.println("Enter 'balance' to check balance or 'logout' to logout:");
        String action = scanner.next();
        if (action.equals("balance")) {
            atmMachine.checkBalance();
        } else if (action.equals("logout")) {
            atmMachine.logout();
        }

    }
}
