public abstract class SnackDispenseHandler {
    protected SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(VendingMachine machine) {
        if (machine.getSelectedSnack() != null && canHandle(machine.getSelectedSnack().getName())) {
            if (machine.getInsertedMoney() >= machine.getSelectedSnack().getPrice() &&
                    machine.getSelectedSnack().getQuantity() > 0) {
                dispenseSnack(machine);
                machine.setState(new IdleState());
            } else {
                System.out.println("Not enough money or snack is out of stock.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(machine);
        } else {
            System.out.println("No suitable handler found for the snack.");
        }
    }

    protected abstract boolean canHandle(String snackName);
    protected abstract void dispenseSnack(VendingMachine machine);
}

