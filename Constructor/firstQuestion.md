package Constructor;

public class Book {
String title;
String Author;
float price;

    Book(String title, String Author, float price){
        this.title = title;
        this.Author = Author;
        this.price = price;
        show();
    }

    Book(String title, String Author){
        this.title = title;
        this.Author = Author;
        show();

    }

    void show(){
        System.out.println(title);
        System.out.println(Author);
        System.out.println(price);
    }

    public static void main(String[] args){

        Book b1 = new Book("The resistance", "Jay Parkash Soni");
        System.out.println("------------------------------");
        Book b = new Book("for standard", "Aditya Om Birla");

    }
}

