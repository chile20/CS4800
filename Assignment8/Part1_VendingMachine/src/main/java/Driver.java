public class Driver {
    public static void main(String[] args) {
        SnackDispenseHandler handlerChain = new CokeHandler(
                new PepsiHandler(
                        new CheetosHandler(
                                new DoritosHandler(
                                        new KitKatHandler(
                                                new SnickersHandler(null))))));

        VendingMachine machine = new VendingMachine(handlerChain);
        machine.addSnack(new Snack("Coke", 25, 1));
        machine.addSnack(new Snack("Pepsi", 25, 1));
        machine.addSnack(new Snack("Cheetos", 30, 2));
        machine.addSnack(new Snack("Doritos", 30, 2));
        machine.addSnack(new Snack("Kitkat", 15, 2));
        machine.addSnack(new Snack("Snickers", 50, 1));


        // Simulate user actions
        System.out.println("User selects 'Coke'");
        machine.selectSnack("Coke");
        System.out.println("User inserts 10 cents");
        machine.insertMoney(10);
        System.out.println("User inserts another 15 cents");
        machine.insertMoney(15);
    }
}
