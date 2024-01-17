package Challenge_Exercise.CatHome;

import java.util.List;

class Cat {
    private String name;
    private int age;
    private String breed;
    private String description;
    private boolean isAdopted;

    public Cat(String name, int age, String breed, String description) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.description = description;
        this.isAdopted = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void adopt() {
        isAdopted = true;
    }

    @Override
    public String toString() {
        return "{name='" + name + "', age=" + age + ", breed='" + breed + "', description='" + description + "', isAdopted=" + isAdopted + '}';
    }
}


public class CatHome {
    public static void main(String[] args) {
        CatManager catManager = new CatManager();

        catManager.addCat(new Cat("Fluffy", 3, "Persian", "Sweet and playful"));
        catManager.addCat(new Cat("Whiskers", 2, "Siamese", "Loves to cuddle"));
        catManager.addCat(new Cat("simba", 1, "Siamese", "Loves to cuddle"));
        catManager.addCat(new Cat("skywalker", 4, "Siamese", "Loves to cuddle"));
        catManager.addCat(new Cat("grumpy", 3, "Siamese", "Loves to cuddle"));
        catManager.addCat(new Cat("Mittens", 4, "Bengal", "Adventurous and friendly"));

        // Display available cats
        catManager.displayAvailableCats();

        // Search for cats by breed
        List<Cat> siameseCats = catManager.searchCatsByBreed("Siamese");
        System.out.println("\nSiamese Cats:");
        siameseCats.forEach(System.out::println);

        // Search for cats by age
        List<Cat> threeYearOldCats = catManager.searchCatsByAge(3);
        System.out.println("\nThree-Year-Old Cats:");
        threeYearOldCats.forEach(System.out::println);
        System.out.println("");
       // Adopt a cat
        Cat adoptedCat = siameseCats.get(0);
        catManager.adoptCat(adoptedCat);

        System.out.println("");
        // Display all cats
        catManager.displayAllCats();
    }
}

