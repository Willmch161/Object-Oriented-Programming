//import libraries
import java.util.ArrayList;

//class declaration
public class Onlineshop {

    //atribut 
    ArrayList<Product> productList = new ArrayList<>();
    //mutator 
    public void addProduct(Product product) {
        productList.add(product);
    }
    //accessor
    public void showAllProducts() {

        for (Product p : productList) {
            p.displayProduct();
        }
        //the method searches for a product inside the list

    }
    //mutator   
    public void sellProduct(String id, int amount) {

        for (Product p : productList) {

            if (p.productID.equals(id)) { //this checks the product ID matches the requested ID
                p.sellProduct(amount);
                return;
            }

        }

        System.out.println("Product not found");

    }

}