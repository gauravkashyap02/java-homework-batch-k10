class Product{

int productid;
String productName;
double price;

void discount(int discount){
    discount -= price;
}

void showResult(){
    System.out.println("product id: "+productid)
    System.out.println("Product name : "+productName);
    System.out.println("product price: "+price);
}

Product(){
    
}

public static void main(String[] args){

Product pd = new Product();

pd.discount(30.0);

pd.showresult(101,"gaurav",90.90);


}
}