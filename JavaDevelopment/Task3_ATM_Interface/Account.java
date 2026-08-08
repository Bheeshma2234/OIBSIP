public class Account {

    private String userId;
    private String pin;
    private String accountHolderName;
    private double balance;

    public Account(String userId, String pin, String accountHolderName, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
