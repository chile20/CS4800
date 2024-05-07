public abstract class SnackDispenseHandler {
    protected SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean handleRequest(Snack snack){
        if (nextHandler != null){
            return nextHandler.handleRequest(snack);
        }
        return false;
    }
}

