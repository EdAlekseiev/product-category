package app;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    public List<Product> getProducts() {
        return Arrays.asList(
            new Product("Smartphone", "Electronics", 900.0),
            new Product("Toaster", "Appliances", 45.0),
            new Product("TV", "Electronics", 1200.0),
            new Product("Vacuum Cleaner", "Appliances", 150.0),
            new Product("Gaming Console", "Electronics", 500.0),
            new Product("Refrigerator", "Appliances", 700.0),
            new Product("Smartwatch", "Electronics", 200.0),
            new Product("Microwave", "Appliances", 120.0),
            new Product("Laptop", "Electronics", 1300.0),
            new Product("Dishwasher", "Appliances", 600.0)
        );
    }
}
