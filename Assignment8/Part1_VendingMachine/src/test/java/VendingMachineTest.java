import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendingMachineTest {
    private VendingMachine machine;
    private Snack snack;

    @Before
    public void setUp() {
        SnackDispenseHandler handlerChain = new CokeHandler(
                new PepsiHandler(
                        new DoritosHandler(
                                null)));
        machine = new VendingMachine(handlerChain);
        machine.addSnack(new Snack("Doritos", 30, 2));
        machine.addSnack(new Snack("Pepsi", 25, 1));
    }

    @Test
    public void testSelectSnackTransitionToWaitingForMoneyState() {
        machine.selectSnack("Doritos");
        assertTrue(machine.getCurrentState() instanceof WaitingForMoneyState);
        assertEquals("Doritos", machine.getSelectedSnack().getName());
    }

    @Test
    public void testDispenseSnackAndReturnChange() {
        machine.selectSnack("Doritos");
        machine.insertMoney(30); // More than the price
        assertEquals(IdleState.class, machine.getCurrentState().getClass());
    }
}
