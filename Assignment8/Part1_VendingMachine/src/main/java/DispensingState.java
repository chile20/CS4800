public class DispensingState implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void insertMoney(VendingMachine machine, int money) {
        System.out.println("Dispensing in progress. Please wait.");
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        SnackDispenseHandler handlerChain = machine.getHandlerChain();
        boolean success = handlerChain.handleRequest(snack);
        if (success) {
            snack.dispense();
            machine.setInsertedMoney(machine.getInsertedMoney() - snack.getPrice());
            machine.changeState(new IdleState());
            if (machine.getInsertedMoney() > 0) {
                System.out.println("Returning extra money: " + machine.getInsertedMoney());
                machine.setInsertedMoney(0);
            }
        } else {
            System.out.println("Error in dispensing.");
            machine.changeState(new IdleState());
        }
    }
}

