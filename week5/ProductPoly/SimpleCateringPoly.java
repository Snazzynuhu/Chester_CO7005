package ProductPoly;



public class SimpleCateringPoly {
    public static void main(String[] args) {

        DrinkPoly coke = new DrinkPoly("Fanta", 1.5, 140, 50, "Medium");
        SnackPoly chips = new SnackPoly("Potato Chips", 2.0, 200, 100, "Ginger & Onion");
        SandwichPoly turkeySandwich = new SandwichPoly("Chicken Sandwich", 5.0, 550, 20, "Turkey");

        // coke.displayDetails();
        coke.consume();
        // chips.displayDetails();
        chips.consume();
        // turkeySandwich.displayDetails();
        turkeySandwich.consume();
    }
}
