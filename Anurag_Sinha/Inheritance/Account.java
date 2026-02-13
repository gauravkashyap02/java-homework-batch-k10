package Inheritance;

class Account {
    double Balance=10000.25F;

    void ShowBalance(){

        System.out.println("Current Balance:"+Balance);

    }
}
class SavingAccount extends Account {
    float intrest = 6.50F;
    double rate=Balance*intrest*1/100;
    double total=Balance+rate;

    void ShowBalance() {

        System.out.printf("Balance With Interest: %.2f", total);
    }

    public static void main(String[] args){
    SavingAccount s=new SavingAccount();
        s.ShowBalance();
    }
}