package Method;

public class BankAccount {

    String accountHolderName;
    String accountNumber;
    double balance;

    void setAccountDetails(String ahn, String an , double b){
        accountHolderName = ahn;
        accountNumber = an;
        balance = b;
    }

    void deposit(double amount){
        if(amount > 0){            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("$" + amount + " withdraw succefully");
        }else{
            System.out.println("Insufficient balance");
        }
    }

    void displayAccountInfo(){
        System.out.println("Account Holder Name is: " +accountHolderName);
        System.out.println("Account Number is: "+accountNumber);
        System.out.println("Balance is: " +balance);
    }

    public static void main(String[] args){
            BankAccount acc = new BankAccount();

            acc.setAccountDetails("Gaurav","BIO129072537",100);

            acc.deposit(100000);
            acc.withdraw(1200);




    }
}
