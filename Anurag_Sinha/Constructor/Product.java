package Constructor;
import java.util.*;

public class Product {
    String productid;
    String productname;
    double price;
    double updatedprice;

    void applydiscount(double price){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The discount in percentage: % ");
        double discount=sc.nextDouble();

        this.price=price;


        updatedprice = price - (price * discount / 100);

    }

    void ProductDetail(){


        System.out.println("Product Name: "+productname);
        System.out.println("Product id: "+productid);
        System.out.println("Product Price: "+price);
        System.out.println("Price after discount: "+updatedprice);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Product p=new Product();

        System.out.println("Enter The Product Name: ");
        p.productname=sc.nextLine();

        System.out.println("Enter The Product id: ");
        p.productid=sc.nextLine();

        System.out.println("Enter The Product Price: ");
        p.price=sc.nextDouble();

        p.applydiscount(p.price);

        p.ProductDetail();


    }
}
