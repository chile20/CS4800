public class SnickersHandler extends SnackDispenseHandler {
    public SnickersHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(String snackName) {
        return "Snickers".equalsIgnoreCase(snackName);
    }

    @Override
    protected void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        snack.dispense();
        System.out.println("Dispensing " + snack.getName());
    }
}