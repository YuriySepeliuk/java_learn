package lab4;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        // Створення масиву об'єктів Product
        Product[] products = {
            new Product(1, "Milk", "BrandA", 2.50, 7, 50),
            new Product(2, "Bread", "BrandB", 1.00, 5, 100),
            new Product(3, "Cheese", "BrandC", 5.00, 20, 30),
            new Product(4, "Milk", "BrandD", 3.00, 10, 40),
            new Product(5, "Juice", "BrandE", 1.50, 30, 60),
        };

        Scanner scanner = new Scanner(System.in);

        // Пошук товарів за заданим найменуванням
        System.out.print("Введіть найменування товару для пошуку: ");
        String searchName = scanner.nextLine();
        findByName(products, searchName);

        // Пошук товарів за найменуванням і ціною
        System.out.print("Введіть найменування товару: ");
        searchName = scanner.nextLine();
        System.out.print("Введіть максимальну ціну: ");
        double maxPrice = scanner.nextDouble();
        findByNameAndPrice(products, searchName, maxPrice);

        // Пошук товарів за терміном зберігання
        System.out.print("Введіть мінімальний термін зберігання (у днях): ");
        int minExpiration = scanner.nextInt();
        findByExpiration(products, minExpiration);

        scanner.close();
    }

    // Метод для пошуку товарів за найменуванням
    public static void findByName(Product[] products, String name) {
        System.out.println("Товари з найменуванням '" + name + "':");
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    // Метод для пошуку товарів за найменуванням і максимальною ціною
    public static void findByNameAndPrice(Product[] products, String name, double maxPrice) {
        System.out.println("Товари з найменуванням '" + name + "' та ціною до " + maxPrice + ":");
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }

    // Метод для пошуку товарів за терміном зберігання
    public static void findByExpiration(Product[] products, int minExpiration) {
        System.out.println("Товари з терміном зберігання більше " + minExpiration + " днів:");
        for (Product product : products) {
            if (product.getExpirationDays() > minExpiration) {
                System.out.println(product);
            }
        }
    }
}
