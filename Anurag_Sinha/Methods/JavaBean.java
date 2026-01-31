import java.util.*;

class Product {

    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Enter Product ID: ");
        p.setId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter Product Price: ");
        p.setPrice(sc.nextDouble());

        System.out.println("\n--- Product Details ---");
        System.out.println("ID: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
    }
}
