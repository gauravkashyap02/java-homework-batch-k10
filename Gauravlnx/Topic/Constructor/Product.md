class Product{

int productid;
String productName;
double price;

void discount(int discountPercentage){
double disAmount = (price * discountPercentage) / 100;
price = price - disAmount;
}

void showResult(){
System.out.println("product id: "+productid);
System.out.println("Product name : "+productName);
System.out.println("Updated price: "+price);
}

public static void main(String[] args){

Product pd = new Product();

pd.productid = 101;
pd.productName = "Aula f75 pro";
pd.price = 7000;

pd.discount(30);
pd.showResult();



}
}