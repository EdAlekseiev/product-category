package app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductProcessor productProcessor = new ProductProcessor();

        List<Product> products = productRepository.getProducts();
        Category category = productProcessor.findCategoryWithHighestAveragePrice(products);

        System.out.println("Category: " + category.name());
        System.out.println("Average Price: " + category.averagePrice());
    }
}
