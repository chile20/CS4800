public class WaitingForMoneyState implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        System.out.println("Already selected a snack, please insert money.");
    }

    @Override
    public void insertMoney(VendingMachine machine, int money) {
        machine.setInsertedMoney(machine.getInsertedMoney() + money);
        if (machine.getInsertedMoney() >= machine.getSelectedSnack().getPrice()) {
            System.out.println("Sufficient funds received. Transitioning to DispensingState...");
            machine.changeState(new DispensingState());
            machine.dispenseSnack();
        } else {
            System.out.println("Not enough money, please insert more.");
        }
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        System.out.println("Please insert enough money first.");
    }
}
