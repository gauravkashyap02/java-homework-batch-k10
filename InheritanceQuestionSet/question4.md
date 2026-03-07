package question4;

    class Shappe {
        void area(){
            System.out.println("Calculating area:");
        }
    }

    class Rectangle extends Shape {
        int width;
        int breadth;

    public Rectangle(int width, int breadth){
        this.width=width;
        this.breadth=breadth;
    }

    public void area(){
        int result=width*breadth;
        System.out.print(result);
    }
}



    public class Shape{
        public static void main(String[] args) {
            Rectangle r = new Rectangle(10,20);
            r.area();
        }
    }
