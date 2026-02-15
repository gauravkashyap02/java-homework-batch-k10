package Inheritance.Books;

class Books {
    String title="Java";
    String author="Jk";

    void showDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class LibraryBook extends Books{
    int selfNumber=5;
    void showDetails(){
        super.showDetails();
        System.out.println("Self Number: "+selfNumber);
    }
}

class Main{
    public static void main(String[] args){
        LibraryBook book=new LibraryBook();
        book.showDetails();

    }
}