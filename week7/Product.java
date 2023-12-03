import java.io.Serializable;

class Product implements Serializable {
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

    // Getters and setters (not shown for brevity)
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        if(newPrice > 0){
            this.price = newPrice;
        }
    }
    public int getCalories(){
        return this.calories;
    }
    public void setCalories(int newCalories){
        if(newCalories >= 0){
            this.calories = newCalories;
        }
    }
       public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int newQuantity){
        if(newQuantity >= 1){
            this.quantity = newQuantity;
        }
    }

    

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", quantity=" + quantity +
                '}';
    }
}
