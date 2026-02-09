package Constructor;
import java.util.*;

class Book {
    String title;
    String author;
    double price;

    Book(String title,String author,Double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    Book(String title,String author){
        this.title=title;
        this.author=author;
        this.price=250.00;
    }

    void Display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter Book Title");
        String title=sc.nextLine();

        System.out.println("Enter Book Author");
        String author=sc.nextLine();

        System.out.println("Y.Yes");
        System.out.println("N.No");
        System.out.print("You Want to Enter The Book Price:");
        String a=sc.nextLine();

        Book b=null;

        switch(a){
            case "Y":
            case "y":
            case "yes":
            case "Yes":
            case "YES":
                System.out.print("Enter Book Price:");
                double price=sc.nextDouble();
                b =new Book(title,author,price);
            break;

            case "N":
            case "n":
            case "No":
            case "no":
            case "NO":
                b =new Book(title,author);
            break;

            default:
                System.out.println("Invalid Input");
        }

        b.Display();

    }
}