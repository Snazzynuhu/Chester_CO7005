package Challenge_Exercise.CatHome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatManager {
    private List<Cat> cats;

    public CatManager() {
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public List<Cat> searchCatsByBreed(String breed) {
        return cats.stream()
                .filter(cat -> cat.getBreed().equalsIgnoreCase(breed))
                .collect(Collectors.toList());
    }

    public List<Cat> searchCatsByAge(int age) {
        return cats.stream()
                .filter(cat -> cat.getAge() == age)
                .collect(Collectors.toList());
    }

    public void adoptCat(Cat cat) {
        if (!cat.isAdopted()) {
            cat.adopt();
            System.out.println("Congratulations! You've adopted " + cat.getName());
        } else {
            System.out.println(cat.getName() + " is already adopted.");
        }
    }

    public void displayAvailableCats() {
        System.out.println("Available Cats for Adoption:");
        for (Cat cat : cats) {
            if (!cat.isAdopted()) {
                System.out.println(cat);
            }
        }
    }

    public void displayAllCats() {
        System.out.println("All Cats in the System:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
