import java.util.*;

public class ZeroOneKnapsack {

    /**
     * Compares all possible combinations (subsets) which gives 2^N possibilities.
     */
    public void calculateByBruteForce(int knapsackMaxWeight,
                                              Map<String, Integer> values,
                                              Map<String, Integer> weights) {

        List<String> selectedItems = new ArrayList<>();
        int maxValue = 0;
        for (Entry<String, Integer> value : values.entrySet()) {
            selectedItems.add(value.getKey());
            if (calculateValue(selectedItems, values) > maxValue
                    && calculateWeight(selectedItems, weights) < knapsackMaxWeight) {

                maxValue = calculateValue(selectedItems, values);
            } else {
                selectedItems.remove(value.getKey());
            }
        }
        //return selectedItems;
    }

    private int calculateValue(List<String> items, Map<String, Integer> values) {
        int total = 0;
        for (String item : items) {
            total += values.get(item);
        }
        return total;
    }

    private int calculateWeight(List<String> items, Map<String, Integer> weights) {
        int total = 0;
        for (String item : items) {
            total += weights.get(item);
        }
        return total;
    }
}
