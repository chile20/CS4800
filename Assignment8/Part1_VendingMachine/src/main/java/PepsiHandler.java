public class PepsiHandler extends SnackDispenseHandler {
    public PepsiHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(String snackName) {
        return "Pepsi".equalsIgnoreCase(snackName);
    }

    @Override
    protected void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        snack.dispense();
        System.out.println("Dispensing " + snack.getName());
    }
}
