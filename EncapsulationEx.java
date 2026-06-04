class BankAccount{
    public double balance = 0;
}
public class EncapsulationEx {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 1000; // Directly accessing the balance variable
        System.out.println("Balance: " + account.balance);
    }
}