package Overloading_and_Overriding.Shapes;

class Shapes {
    void printshapes(){
        System.out.println("This is a Shape.");
    }
}
class Square extends Shapes{
    void printshapes(){
        System.out.println("This is a Square.");
    }
}
class Triangle extends Shapes{
    void printshapes(){
        System.out.println("This is a Triangle.");
    }
}

class Main{
    public static void main(String[] args){
        Shapes s=new Shapes();
        Shapes s1=new Square();
        Shapes s2=new Triangle();
        s.printshapes();
        s1.printshapes();
        s2.printshapes();
    }
}
