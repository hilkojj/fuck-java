package week3.ATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the context
        ATM atm = new ATM();
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println("\n\nType a number for an event:");
            System.out.println("1. Insert card");
            System.out.println("2. Enter PIN code");
            System.out.println("3. Enter amount");
            System.out.println("4. I want my money honey");
            System.out.println();

            switch (s.nextLine()) {
                case "1":
                    atm.insertCard();
                    break;
                case "2":
                    atm.insertPin();
                    break;
                case "3":
                    atm.requestAmount();
                    break;
                case "4":
                    atm.ejectCard();
                    break;
                default:
                    System.err.println("Number unrecognized.");
            }
        }

    }
}