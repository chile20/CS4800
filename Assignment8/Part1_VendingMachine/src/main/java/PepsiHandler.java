public class PepsiHandler extends SnackDispenseHandler {
    private String name = "Pepsi";

    public PepsiHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public boolean handleRequest(Snack snack){
        System.out.println("Chain moves to " + this.name);
        if (snack.getName() == this.name){
            if (snack.getQuantity() > 0){
                System.out.println("Dispensed " + this.name);
                snack.dispense();
                return true;
            } else {
                System.out.println(this.name + " is out of stock");
                return false;
            }
        } else {
            return super.handleRequest(snack);
        }
    }
}
