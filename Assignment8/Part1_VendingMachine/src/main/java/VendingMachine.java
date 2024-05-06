import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private StateOfVendingMachine currentState;
    private Map<String, Snack> snacks;
    private int insertedMoney;
    private Snack selectedSnack;
    private SnackDispenseHandler handlerChain;


    public VendingMachine(SnackDispenseHandler handlerChain) {
        this.snacks = new HashMap<>();
        this.currentState = new IdleState();
        this.handlerChain = handlerChain;
    }

    public void setState(StateOfVendingMachine newState) {
        this.currentState = newState;
    }
    public void addSnack(Snack snack) {
        snacks.put(snack.getName(), snack);
    }

    public Snack getSnack(String name) {
        return snacks.get(name);
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(this, snackName);
    }

    public void insertMoney(int money) {
        currentState.insertMoney(this, money);
    }

    public void dispenseSnack() {
        handlerChain.handleRequest(this);
    }
    public void changeState(StateOfVendingMachine newState) {
        currentState = newState;
    }

    public void setInsertedMoney(int money) {
        insertedMoney = money;
    }

    public int getInsertedMoney() {
        return insertedMoney;
    }

    public void setSelectedSnack(Snack snack) {
        selectedSnack = snack;
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }
}
