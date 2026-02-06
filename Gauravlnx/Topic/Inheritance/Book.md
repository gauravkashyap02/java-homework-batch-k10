class Book{

    String title;
    String author;

    void showDetails(String t, String a){
        title = t;
        author = a;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}

class LibraryBook extends Book{

    int shelfNumber;

    void showDetails(String t, String a, int s){
        title = t;
        author = a;
        shelfNumber = s;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ShelfNumber: "+shelfNumber);
    }
}
public class Main{
public static void main(String[] args){
        
        Book b = new Book();
        b.showDetails("Java Basics","John Smith",5);

    }
}