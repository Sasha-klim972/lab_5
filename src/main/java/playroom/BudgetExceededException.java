package playroom;
public class BudgetExceededException extends Exception {
    public BudgetExceededException(String message) {
        super(message);
    }
}