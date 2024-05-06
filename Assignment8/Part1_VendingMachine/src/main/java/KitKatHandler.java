public class KitKatHandler extends SnackDispenseHandler {
    public KitKatHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(String snackName) {
        return "KitKat".equalsIgnoreCase(snackName);
    }

    @Override
    protected void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        snack.dispense();
        System.out.println("Dispensing " + snack.getName());
    }
}