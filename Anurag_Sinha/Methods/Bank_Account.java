import java.util.*;
class Bank_Account {
        String name;
        String number;
        double balance;
        double amount;

    void Account_Holder_Details(String name,String number,double balance){
        this.name=name;
        this.number=number;
        this.balance=balance;
    }

    void Deposit(double amount){
        this.amount=amount;
        balance=balance+amount;
    }

    void Withdraw(double amount){
        this.amount=amount;
        if(balance!=0) {
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void Display_Account_Info(){
        System.out.println("Name: "+name);
        System.out.println("Number: "+number);
        System.out.println("Balance: "+balance);
    }
    static void main(){
        Scanner sc=new Scanner(System.in);
        Bank_Account bank=new Bank_Account();
        System.out.println("Enter Name: ");
        String name=sc.nextLine();

        System.out.println("Enter Number: ");
        String number=sc.nextLine();

        System.out.println("Enter D for Deposit Or W for Withdraw: ");
        char option=sc.next().charAt(0);
        switch (option){
            case 'D':
            case 'd':
                System.out.println("Enter Amount to Deposit: ");
                bank.Deposit(sc.nextDouble());
            break;

            case 'W':
            case 'w':
                System.out.println("Enter Amount to Withdraw: ");
                bank.Withdraw(sc.nextDouble());
            break;

            default:
                System.out.println("Invalid Option");

        }
        bank.Account_Holder_Details(name,number,bank.balance);

        bank.Display_Account_Info();
    }
}
