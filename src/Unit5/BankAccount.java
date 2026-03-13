package Unit5;

//Checked Custom Exception to throw insufficient fund exception for bank account.
class IFException extends Exception {
    public IFException() {
        super();
    }
    public IFException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws IFException {
        if (amount > balance) {
            throw new IFException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount(100.0);
        try {
            a.withdraw(150.0);
        } catch (IFException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

