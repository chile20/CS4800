public class IdleState implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine machine, String snackName) {
        Snack snack = machine.getSnack(snackName);
        if (snack != null && snack.getQuantity() > 0) {
            System.out.println("Transitioning to WaitingForMoneyState...");
            machine.setSelectedSnack(snack);
            machine.changeState(new WaitingForMoneyState());
            System.out.println(snackName + " selected. Please insert money.");
        }
        else {
            System.out.println("Snack not available or sold out.");
        }
    }

    @Override
    public void insertMoney(VendingMachine machine, int money) {
        System.out.println("No snack selected. Please select a snack first.");
    }

    @Override
    public void dispenseSnack(VendingMachine machine) {
        System.out.println("No snack selected and money inserted. Please select a snack first.");
    }
}
