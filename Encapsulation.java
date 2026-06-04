class BankAccount{
    private double Balance = 0; // Encapsulated balance variable
    public void setBalance(int amount){
        Balance+= amount; // Method to update balance
    }
    public double getBalance(){
        return Balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(30000); // Updating balance using method
        System.out.println(account.getBalance());
        // System.out.println("Balance: " + account.balance); // This line would cause an error due to private access
    }
}