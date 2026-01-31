import java.util.Scanner;

class LibraryBook {


    String title;
    String author;
    boolean isAvailable;


    void setDetails(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }


    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    void displayStatus() {
        System.out.println("\n--- Book Status ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryBook book = new LibraryBook();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        book.setDetails(title, author);

        System.out.println("\n1. Borrow Book");
        System.out.println("2. Return Book");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            book.borrowBook();
        } else if (choice == 2) {
            book.returnBook();
        } else {
            System.out.println("Invalid choice");
        }

        book.displayStatus();

    }
}
