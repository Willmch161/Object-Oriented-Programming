import java.util.List; // we ask for a called List of orders, and we want to be able to use any type of order, so we use generics to allow for flexibility in the types of orders we can handle.

public class OrderManagementSystem { //"We make a big box named OrderManagementSystem to hold all the little helpers."

    // Generic Method 1: This little note says: next helper adds up money from many orders."
    public static <T, U extends Number> double calculateTotal(List<Order<T, U>> orders) {
        double total = 0.0;
        for (Order<T, U> order : orders) {
            // Safe to call doubleValue() because U extends Number
            total += order.getPrice().doubleValue(); 
        }
        return total;
    }

    // Generic Method 2: Make a helper named findMostExpensive that gets a list of orders and gives back the most expensive order; T is 'kind of ID', U is 'kind of number'."
    public static <T, U extends Number> Order<T, U> findMostExpensive(List<Order<T, U>> orders) {
        if (orders == null || orders.isEmpty()) {
            return null;
        }

        Order<T, U> mostExpensive = orders.get(0); //"For every order toy in the list, do the next steps one by one."
        for (Order<T, U> order : orders) {
            if (order.getPrice().doubleValue() > mostExpensive.getPrice().doubleValue()) {
                mostExpensive = order;
            }
        }
        return mostExpensive;
    }

    public static void main(String[] args) { //"This is the main part where we show how to use our helpers with different types of orders."
        
        //Print a title that says: now we show food orders
        System.out.println("### SCENARIO 1: Food Orders (ID: Integer, Price: Double) ###");
        OrderRepository<Integer, Double> foodRepo = new OrderRepository<>();
        foodRepo.addOrder(new Order<>(101, "Margherita Pizza", 12.99, "Food"));
        foodRepo.addOrder(new Order<>(102, "Cheeseburger", 8.50, "Food"));
        foodRepo.addOrder(new Order<>(103, "Truffle Pasta", 18.75, "Food"));

        foodRepo.displayOrders();
        System.out.printf("Total Price: $%.2f%n", calculateTotal(foodRepo.getOrders()));
        Order<Integer, Double> topFood = findMostExpensive(foodRepo.getOrders());
        System.out.println("Most Expensive Food: " + topFood.getName() + " ($" + topFood.getPrice() + ")\n");


        System.out.println("### SCENARIO 2: Electronics Orders (ID: String, Price: Integer) ###");
        OrderRepository<String, Integer> electronicsRepo = new OrderRepository<>();
        electronicsRepo.addOrder(new Order<>("E-001", "Laptop", 1200, "Electronics"));
        electronicsRepo.addOrder(new Order<>("E-002", "Smartphone", 850, "Electronics"));
        electronicsRepo.addOrder(new Order<>("E-003", "Noise-cancelling Headphones", 250, "Electronics"));

        electronicsRepo.displayOrders();
        System.out.printf("Total Price: $%.2f%n", calculateTotal(electronicsRepo.getOrders()));
        Order<String, Integer> topTech = findMostExpensive(electronicsRepo.getOrders());
        System.out.println("Most Expensive Tech: " + topTech.getName() + " ($" + topTech.getPrice() + ")");
    }
}