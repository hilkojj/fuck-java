package week3.ATM;

import java.util.Scanner;

public interface ATMState {

    void insertCard(ATM atm);

    void ejectCard(ATM atm);

    void insertPin(ATM atm);

    void requestAmount(ATM atm);

    class Idle implements ATMState {
        @Override
        public void insertCard(ATM atm) {
            System.out.println("Thank you for your card.");
            atm.setState(new ReadingPin());
        }

        @Override
        public void ejectCard(ATM atm) {
            System.err.println("Please enter your card first.");
        }

        @Override
        public void insertPin(ATM atm) {
            System.err.println("Please enter your card first.");
        }

        @Override
        public void requestAmount(ATM atm) {
            System.err.println("Please enter your card first.");
        }
    }

    class ReadingPin implements ATMState {

        @Override
        public void insertCard(ATM atm) {
            System.err.println("There already is a card inserted");
        }

        @Override
        public void ejectCard(ATM atm) {
            System.out.println("K bye.");
            atm.setState(new Idle());
        }

        @Override
        public void insertPin(ATM atm) {
            System.out.println("Please enter your pin & press enter");
            Scanner s = new Scanner(System.in);
            if (s.nextLine().equals("1234")) {

                System.out.println("Pin correct.");
                atm.setState(new ChoosingTransaction());

            } else System.err.println("Pin incorrect, try again. (HINT: 1234)");
        }

        @Override
        public void requestAmount(ATM atm) {
            System.out.println("Please enter your pin first.");
        }
    }

    class ChoosingTransaction implements ATMState {

        @Override
        public void insertCard(ATM atm) {
            System.err.println("There already is a card inserted");
        }

        @Override
        public void ejectCard(ATM atm) {
            System.out.println("K bye.");
            atm.setState(new Idle());
        }

        @Override
        public void insertPin(ATM atm) {
            System.err.println("I only need your Pin once.");
        }

        @Override
        public void requestAmount(ATM atm) {
            System.out.println("Please enter amount & press enter");
            Scanner s = new Scanner(System.in);
            try {
                float amount = Float.valueOf(s.nextLine());
                System.out.println("*gives $" + amount + "* \n\nTransaction done.\nPlease take your card & money.");
                atm.setState(new TransactionComplete());
            } catch (NumberFormatException e) {
                System.err.println("Please format the amount properly. eg: 15.00\n\nTry again");
            }
        }
    }

    class TransactionComplete implements ATMState {
        @Override
        public void insertCard(ATM atm) {
            System.err.println("There already is a card inserted");
        }

        @Override
        public void ejectCard(ATM atm) {
            System.out.println("Thank you. Bye.");
            atm.setState(new Idle());
        }

        @Override
        public void insertPin(ATM atm) {
            System.err.println("I only need your Pin once.");
        }

        @Override
        public void requestAmount(ATM atm) {
            System.err.println("You already have requested money.");
        }
    }


}
