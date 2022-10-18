import java.util.Comparator;

public class MaxCostComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getCost() - o2.getCost();
    }
}
