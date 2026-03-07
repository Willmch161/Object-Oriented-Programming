//ini buat deklaraasi membuat kelas Product 
public class Product {

// ...existing code...
private double Price; // add only if not already declared

public double getPrice() {
    return price;
}
// ...existing code...

    //atribut atau variabel buat informasi produk seperti nama, harga, stok, kategori, dll sertain tipe data terlebih dahulu
    
    String productID;
    String productName;
    double price;
    int stock;
    String category;


    //Constructor untuk inisialisasi objek Product dengan parameter yang sesuai dengan atributnya
    public Product(String productID ,String productName, double price, int stock, String category) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

      // [MUTATOR] modifies stock
    public void addStock(int amount) {
        stock += amount;
    }

    // [MUTATOR] modifies stock
    public void sellProduct(int amount) {

        if (amount <= stock) {
            stock -= amount;
            System.out.println(productName + " sold: " + amount);
        } else {
            System.out.println("Stock not enough!");
        }

    }

    // [MUTATOR] modifies price
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    // [ACCESSOR] reads stock status
    public boolean checkStock() {
        return stock > 0;
    }

    // [ACCESSOR] displays product information
    public void displayProduct() {

        System.out.println("ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Category: " + category);
        System.out.println("-------------------");

    }

}