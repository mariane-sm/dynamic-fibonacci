import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PowerSetTest {

    PowerSet powerSet = new PowerSet();

    @Test
    public void calculateAllSubsets() {
        HashSet<String> items = new HashSet<>();
        items.add("A");
        items.add("B");
        items.add("C");

        Set<Set<String>> result = powerSet.findSubsets(items);

        assertThat(result, is(createExpectedSet()));
    }

    private Set<Set<String>> createExpectedSet() {
        HashSet<String> empty = new HashSet<>();

        HashSet<String> a = new HashSet<>();
        a.add("A");

        HashSet<String> b = new HashSet<>();
        b.add("B");

        HashSet<String> c = new HashSet<>();
        c.add("C");

        HashSet<String> ab = new HashSet<>();
        ab.add("A");
        ab.add("B");

        HashSet<String> ac = new HashSet<>();
        ac.add("A");
        ac.add("C");

        HashSet<String> bc = new HashSet<>();
        bc.add("B");
        bc.add("C");

        HashSet<String> abc = new HashSet<>();
        abc.add("A");
        abc.add("B");
        abc.add("C");

        Set<Set<String>> expected = new HashSet<>();
        expected.add(empty);
        expected.add(a);
        expected.add(b);
        expected.add(c);
        expected.add(ab);
        expected.add(ac);
        expected.add(bc);
        expected.add(abc);

        return expected;
    }


}