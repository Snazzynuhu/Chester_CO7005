import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductFiles {
    private static final String FILE_NAME = "products.ser";

    public static void main(String[] args) {
        List<Product> products = loadProducts();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addProduct(scanner, products);
                    break;
                case 2:
                    removeProduct(scanner, products);
                    break;
                case 3:
                    displayProducts(products);
                    break;
                case 4:
                    saveProducts(products);
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            products = (List<Product>) ois.readObject();
            System.out.println("Products loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing file found. Creating a new one.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading products: " + e.getMessage());
        }

        return products;
    }

    private static void saveProducts(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
            System.out.println("Products saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving products: " + e.getMessage());
        }
    }

    private static void addProduct(Scanner scanner, List<Product> products) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter product calories: ");
        int calories = scanner.nextInt();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        Product newProduct = new Product(name, price, calories, quantity);
        products.add(newProduct);

        System.out.println("Product added successfully.");
    }

    private static void removeProduct(Scanner scanner, List<Product> products) {
        System.out.print("Enter the name of the product to remove: ");
        String productName = scanner.nextLine();

        products.removeIf(product -> product.getName().equalsIgnoreCase(productName));

        System.out.println("Product removed successfully.");
    }

    private static void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("List of Products:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
