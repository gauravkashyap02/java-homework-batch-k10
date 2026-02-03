class Rectangle{

    double length;
    double breadth;
    
    Retangle(double l , double b){
            length = l;
            breadth = b;
    }
    
    void compareArea(Rectangle r){
        double area1 = length * breadth;
        double area2 = r.length * r.breadth;

        boolean isSame = area1 == area2;

        System.out.print("Both rectangle have same area : "+isSame);
    }
    
    public static void main(String args[]){
        
        Rectangle r1 = new Rectangle(10, 4);
        Rectangle r2 = new Rectangle(4 , 10);
        
        r1.compareArea(r2);

    }
    



}