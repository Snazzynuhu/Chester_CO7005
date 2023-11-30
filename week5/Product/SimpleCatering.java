package Product;



public class SimpleCatering {
    public static void main(String[] args) {

        Drink coke = new Drink("Fanta", 1.5, 140, 50, "Medium");
        Snack chips = new Snack("Potato Chips", 2.0, 200, 100, "Ginger & Onion");
        Sandwich turkeySandwich = new Sandwich("Chicken Sandwich", 5.0, 550, 20, "Turkey");

        coke.displayDetails();
        chips.displayDetails();
        turkeySandwich.displayDetails();
    }
}
