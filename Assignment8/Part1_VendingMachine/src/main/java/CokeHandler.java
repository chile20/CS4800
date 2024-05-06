public class CokeHandler extends SnackDispenseHandler {
    public CokeHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(String snackName) {
        return "Coke".equalsIgnoreCase(snackName);
    }

    @Override
    protected void dispenseSnack(VendingMachine machine) {
        Snack snack = machine.getSelectedSnack();
        snack.dispense();
        System.out.println("Dispensing " + snack.getName());
    }
}