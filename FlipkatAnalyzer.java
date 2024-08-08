package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FlipkatAnalyzer {
    private Map<String, Map<String, Integer>> productCooccurrence = new HashMap<>();

    public void addProductView(String productId, String cooccurrenceProductId) {
        if (!productCooccurrence.containsKey(productId)) {
            productCooccurrence.put(productId, new HashMap<>());
        }
        Map<String, Integer> cooccurrenceMap = productCooccurrence.get(productId);
        cooccurrenceMap.put(cooccurrenceProductId, cooccurrenceMap.getOrDefault(cooccurrenceProductId, 0) + 1);
    }

    public Map<String, Integer> getCooccurrenceProducts(String productId) {
        return productCooccurrence.get(productId);
    }

    public static void main(String[] args) {
        FlipkatAnalyzer analyzer = new FlipkatAnalyzer();

        analyzer.addProductView("P1", "P2");
        analyzer.addProductView("P1", "P3");
        analyzer.addProductView("P1", "P2");
        analyzer.addProductView("P2", "P3");
        analyzer.addProductView("P3", "P1");

        Map<String, Integer> cooccurrenceProducts = analyzer.getCooccurrenceProducts("P1");
        System.out.println("Co-occurrence products for P1:");
        for (Map.Entry<String, Integer> entry : cooccurrenceProducts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}