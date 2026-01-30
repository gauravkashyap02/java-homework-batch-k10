package Method;

public class Product {

    private int id;
    private String name;
    private double price;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public Product(){

    }

    public static void main(String[] args){

        Product p1 = new Product();

        p1.setName("Perfume");
        p1.setId(101);
        p1.setPrice(2000);

        System.out.println(p1.getName());
        System.out.println(p1.getId());
        System.out.println(p1.getPrice());





    }
}
