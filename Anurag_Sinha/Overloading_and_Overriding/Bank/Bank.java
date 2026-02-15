package Overloading_and_Overriding.Bank;

class Bank {
    int getInterestRate(){
        return 0;
    }
}
class SBI extends Bank{

    int getInterestRate(){
        return 5;
    }
}
class HDFC extends Bank{

    int getInterestRate(){
        return 6;
    }

}
class ICICI extends Bank{

    int getInterestRate(){
        return 7;
    }
}

class Main{
    public static void main(String[] args){
        Bank b1=new SBI();
        Bank b2=new HDFC();
        Bank b3=new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: "+b2.getInterestRate()+"%");
        System.out.println("ICICI Interest Rate: "+b3.getInterestRate()+"%");

    }
}