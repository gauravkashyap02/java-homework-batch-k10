package Inheritance;

class Shape {

    void perimeter(){
        System.out.println("Calculating perimeter");
    }

}

class Square extends Shape{
int side , peri;

    @Override
    void perimeter(){
        peri = 4 * side;
        System.out.println("Perimeter of square is: "+peri);
    }

    public static void main(String[] args){
        Square s = new Square();
        s.side = 10;
        s.perimeter();
    }
}
