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
        machine.addSnack(new Snack("KitKat", 20, 2));
        machine.addSnack(new Snack("Snickers", 50, 1));


        // Simulate user actions
        System.out.println("Test 1: Purchasing 'Coke' with correct fund");
        System.out.println("User selects 'Coke'");
        machine.selectSnack("Coke");
        System.out.println("User inserts 25 cents");
        machine.insertMoney(25);

        System.out.println("Test 2: Purchasing 'Snickers' with extra fund");
        System.out.println("User selects 'Snickers'");
        machine.selectSnack("Snickers");
        System.out.println("User inserts 75 cents");
        machine.insertMoney(75);

        System.out.println("\nTest 3: Purchasing 'KitKat' with incorrect fund in first attempt");
        System.out.println("User selects 'KitKat'");
        machine.selectSnack("KitKat");
        System.out.println("User inserts 15 cents");
        machine.insertMoney(15);
        System.out.println("User inserts another 5 cents");
        machine.insertMoney(5);

        System.out.println("\nTest 4: Purchasing 'Chips' which is not available");
        System.out.println("User selects 'Chips'");
        machine.selectSnack("Chips");

        System.out.println("\nTest 5: Insert money without selecting a snack");
        System.out.println("User inserts 15 cents");
        machine.insertMoney(15);
    }
}
