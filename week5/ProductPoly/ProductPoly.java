package ProductPoly;

abstract class ProductPoly {
    private String name;
    private double price;
    private int calories;
    private int quantity;

    public ProductPoly(String name, double price, int calories, int quantity) {
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
    abstract void consume();

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: \u00A3" + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Quantity: " + quantity);
    }
}

class DrinkPoly extends ProductPoly {
    private String size;

    public DrinkPoly(String name, double price, int calories, int quantity, String size) {
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
        System.out.println("Category: Drink");
    }

    @Override
    public void consume() {
      System.out.println("Glug, glug, glug.\n");
    }
}

class SnackPoly extends ProductPoly {
    private String flavor;

    public SnackPoly(String name, double price, int calories, int quantity, String flavor) {
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
        System.out.println("Category: Snack");
    }
      @Override
    public void consume() {
        System.out.println("Crunch, crunch.\n");
    }
}

class SandwichPoly extends ProductPoly {
    private String filling;

    public SandwichPoly(String name, double price, int calories, int quantity, String filling) {
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
        System.out.println("Category: Sandwich");
    }
    @Override
    public void consume() {
        System.out.println("Chomp!\n");
    }
}

