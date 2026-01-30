package Method;

public class LibraryBook {

    String title;
    String author;
    boolean isAvailable;

    void setDetails(String t, String a){
        title = t;
        author = a;
        isAvailable = true;
    }

    void borrowBook(){
        isAvailable = false;
    }

    void returnBook(){
        isAvailable = true;
    }

    void displayStatus(){
        System.out.println("Title name: " +title);
        System.out.println("Author name: " +author);
        System.out.println("Available: " +isAvailable);
    }

    public static void main(String[] args) {

        LibraryBook lb = new LibraryBook();

        lb.setDetails("Lovelife","Gaurav");
//        lb.borrowBook();
        lb.returnBook();
        lb.displayStatus();





    }
}
