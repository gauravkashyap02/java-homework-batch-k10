class Book{

String title;
String author;
int price;

Book(String t, String a, int p){

    title = t;
    author = a;
    price = p;

}

Book(String t, String a){

    title = t;
    author = a;
    price = 250;
}
void showDetails(){
System.out.println("Title: "+title);
System.out.println("Author: "+author);
System.out.println("Price: "+price);
}

public static void main(String[] args){

Book bk = new Book("Love Java", "GauravLnx");
bk.showDetails();


}

}