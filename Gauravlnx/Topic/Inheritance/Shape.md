class Shape{

    void area(){
        System.out.println("calculating area");
    }
}

class Rectangle extends Shape{

    int length;
    int breadth;

    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    @Override
    void area(){
        int area = length * breadth;
        System.out.println("Area of rectangle is: "+area);
    }
}
class Main{

    public static void main(String[] args){

        Rectangle r = new Rectangle(10,5);
        r.area();

    }
}