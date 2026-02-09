package Overriding;

class Shape {
void printShape(){
System.out.println("This is a shape");
}
}

class Square extends Shape{
void printShape(){
System.out.println("This is a square");
}
}

class Triangle extends Shape{
void printShape(){
System.out.println("This is a triangle");
}
}

class Main2{
public static void main(String[] args){

        Shape sh = new Shape();
        Square sq = new Square();
        Triangle tg = new Triangle();

        sh.printShape();
        sq.printShape();
        tg.printShape();


    }
}
