public class Atm {
    // Instance Variables
    private int balance;
    private String pin;

    // Constructor
    public Atm(int balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // Getter Method
    public int getBalance() {
        return balance;
    }

    // Methods of Behavior
    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        }else{
            System.out.println("Insuffient funds Try again");
        }
    }

    public boolean accessAccount(String pinEntered) {
        if (pinEntered.equals(pin)) {
            return true;
        } else {
            return false;
        }
    }
}
