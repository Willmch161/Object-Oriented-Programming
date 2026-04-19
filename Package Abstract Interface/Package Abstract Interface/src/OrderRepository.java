import java.util.ArrayList; 
import java.util.List;

public class OrderRepository<T, U extends Number> { //membuat child class
    private List<Order<T, U>> orders = new ArrayList<>();

    //method untuk menambahkan order ke dalam repository
    public void addOrder(Order<T, U> order) {
        orders.add(order);
    }

    public List<Order<T, U>> getOrders() {
        return orders;
    }

    public void displayOrders() {
        for (Order<T, U> order : orders) {
            System.out.println(order);
        }
    }
}