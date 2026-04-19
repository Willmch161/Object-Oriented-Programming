public class Order<T, U extends Number> { //buat parent class bernama order

    //atributte - for data inside the box
    private T id;
    private String name;
    private U price;
    private String category;

    //method : things the box can do
    public Order(T id, String name, U price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //getter methods
    public T getId() { return id; }
    public String getName() { return name; }
    public U getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Order { ID: " + id + ", Name: '" + name + "', Category: '" + category + "', Price: " + price + " }";
    }
}