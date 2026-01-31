class Bank{
    String HolderName;
    String AccNo;
    double Balance;

    Bank(String holdername,Strin accNo,double b){
    HolderName=holdername;
    Accno=accNo;
    Balance=b;
    }
    void deposit(double amount){
    balance= balance+amount;
    }
    void withdraw(double amount){
    if(balance>=amount){
    balance = balance- amount;
    }
    else{
    System .out println("insufficient balance")
    }
    }
    void Display(){
    System .out. println("holser name"+HolderName);
    System.out.println("Accnumber:"+AccNo);
    System.out .println("balance"+balance);
    }
    publice static void main(String []args){
    Bank b=new Bank("bhushan singh", "5848558",5000);
    b.deposit(500);
    b.withdraw(200);
    b.Display();
    }