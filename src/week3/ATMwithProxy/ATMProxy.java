package week3.ATMwithProxy;

public class ATMProxy implements AbstractATM {

    private ATM atm = new ATM();

    @Override
    public ATMState getState() {
        return atm.getState();
    }

    @Override
    public float getCashInMachine() {
        return atm.getCashInMachine();
    }
}
