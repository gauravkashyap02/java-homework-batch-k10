import java.util.*;

class Product {

    // Private attributes
    private int id;
    private String name;
    private double price;

    // No-arg constructor
    public Product() {
    }

    // Getters & Setters
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

    // Main method with user input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product(); // JavaBean object

        System.out.print("Enter Product ID: ");
        p.setId(sc.nextInt());

        sc.nextLine(); // buffer clear

        System.out.print("Enter Product Name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter Product Price: ");
        p.setPrice(sc.nextDouble());

        // Display using getters
        System.out.println("\n--- Product Details ---");
        System.out.println("ID: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
    }
}
