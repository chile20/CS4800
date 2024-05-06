public class CheetosHandler extends SnackDispenseHandler {
    public CheetosHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(String snackName) {
        return "Cheetos".equalsIgnoreCase(snackName);
    }

    @Override
    protected void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        snack.dispense();
        System.out.println("Dispensing " + snack.getName());
    }
}