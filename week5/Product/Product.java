package Product;

abstract class Product {
    private String name;
    private double price;
    private int calories;
    private int quantity;

    public Product(String name, double price, int calories, int quantity) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: \u00A3" + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Quantity: " + quantity);
    }
}

class Drink extends Product {
    private String size;

    public Drink(String name, double price, int calories, int quantity, String size) {
        super(name, price, calories, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Category: Drink\n");
    }
}

class Snack extends Product {
    private String flavor;

    public Snack(String name, double price, int calories, int quantity, String flavor) {
        super(name, price, calories, quantity);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Flavor: " + flavor);
        System.out.println("Category: Snack\n");
    }
}

class Sandwich extends Product {
    private String filling;

    public Sandwich(String name, double price, int calories, int quantity, String filling) {
        super(name, price, calories, quantity);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Filling: " + filling);
        System.out.println("Category: Sandwich\n");
    }
}

