package Inheritance;

class Train {
    void run(){
        System.out.println("Train is Running...");
    }
}
class Metro extends Train{
    void run(){
        System.out.println(" Metro is running on an electric track");
    }
    public static void main(){
        Metro m=new Metro();
        m.run();
    }
}