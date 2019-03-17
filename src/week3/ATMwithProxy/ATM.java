package week3.ATMwithProxy;

// the context
public class ATM implements AbstractATM {

    private ATMState state;
    private int amount = 100;

    // define an initial state
    public ATM() {
        setState(new ATMState.Idle());
    }

    void setState(ATMState state) {
        this.state = state;
    }

    public ATMState getState() {
        return this.state;
    }

    @Override
    public float getCashInMachine() {
        return amount;
    }

    void insertCard() {
        state.insertCard(this);
    }

    void ejectCard() {
        state.ejectCard(this);
    }

    void insertPin() {
        state.insertPin(this);
    }

    void requestAmount() {
        state.requestAmount(this);
    }
}
