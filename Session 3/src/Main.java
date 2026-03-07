//buat class main file nya
public class Main {

    public static void main(String[] args) { //method main untuk menjalankan program

        Onlineshop shop = new Onlineshop(); //membuat objek shop dari class Onlineshop

        Product p1 = new Product("P01", "Laptop", 1000, 10, "Electronics");
        Product p2 = new Product("P02", "Mouse", 20, 50, "Accessories");
        Product p3 = new Product("P03", "Keyboard", 40, 30, "Accessories");

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);

        System.out.println("All Products:");
        shop.showAllProducts();

        System.out.println("Selling Product...");
        shop.sellProduct("P01", 2);

        System.out.println("Updated Products:");
        shop.showAllProducts();

    }

}