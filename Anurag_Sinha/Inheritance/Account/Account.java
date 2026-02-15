package Inheritance.Account;

class Account {
    double Balance=10000.25F;

    void ShowBalance(){

        System.out.println("Current Balance:"+Balance);

    }
}
class SavingAccount extends Account {
    float interest = 6.50F;
    double rate=Balance*interest*1/100;
    double total=Balance+rate;

    void ShowBalance() {

        System.out.printf("Balance With Interest: %.2f", total);
    }
}

class Main{
    public static void main(String[] args){
        SavingAccount s=new SavingAccount();
        s.ShowBalance();
    }
}