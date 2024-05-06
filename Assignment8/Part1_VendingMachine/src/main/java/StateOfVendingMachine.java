public interface StateOfVendingMachine {
    void selectSnack(VendingMachine machine, String snackName);
    void insertMoney(VendingMachine machine, int money);
    void dispenseSnack(VendingMachine machine);
}

