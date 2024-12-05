class BankAccount {
    int accountNum;          
    double accountBalance;   
    String customerName;

    BankAccount(String customerName, double accountBalance, int accountNum) {
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.accountNum = accountNum;  
    }

    void viewAvlBalance() {
        System.out.println("Hey " + customerName + " Your Current Balance is: " + accountBalance + " and Account Number: " + accountNum);
    }

    void depositAmount(double amount) {
        System.out.println("Depositing Amount: " + amount);
        accountBalance += amount;
        System.out.println("Your Amount Deposited Successfully!");
    }

    void withdrawAmount(double amount) {
        System.out.println("Withdrawing Amount: " + amount);
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class code16 {         
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("Abhishek", 20000, 12360891);
        customer1.viewAvlBalance();   
        customer1.depositAmount(5000);
        customer1.viewAvlBalance();
        customer1.withdrawAmount(3000);
        customer1.viewAvlBalance();
    }
}
