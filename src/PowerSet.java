import java.util.HashSet;
import java.util.Set;

public class PowerSet {

    /**
     * Returns all possible combinations (subsets) which gives 2^N possibilities.
     */
    public <T> Set<Set<T>> findSubsets(Set<T> items) {
        Set<Set<T>> result = new HashSet<>();
        if (!items.isEmpty()) {
            for (T item : items) {
                Set<T> subset = copyWithoutItem(items, item);
                Set<Set<T>> subsets = findSubsets(subset);
                result.addAll(subsets);
            }
        }
        result.add(items);
        return result;
    }

    private <T> Set<T> copyWithoutItem(Set<T> items, T item) {
        Set<T> result = new HashSet<>(items);
        result.remove(item);
        return result;
    }
}
