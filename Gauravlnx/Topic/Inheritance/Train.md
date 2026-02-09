package Inheritance;

class Train {

    void run(){
        System.out.println("This is running");
    }

}

class Metro extends Train{
    void run(){
        System.out.println("Metro is running on electric track");
    }
}

class Main3{
    public static void main(String[] args){
        Metro m = new Metro();
        m.run();
    }
}

