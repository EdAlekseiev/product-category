package app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductProcessor {
    public Category findCategoryWithHighestAveragePrice(List<Product> products) {
        Map.Entry<String, Double> result = (
            products
            .stream()
            .collect(
                Collectors
                .groupingBy(
                    Product::getCategory,
                    Collectors.averagingDouble(Product::getPrice)
                )
            )
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .orElse(null)
        );

        Category category = new Category("", 0.0);
        if(result != null) {
            category = new Category(result.getKey(), result.getValue());
        }

        return category;
    }
}
