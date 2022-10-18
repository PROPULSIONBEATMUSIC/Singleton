import java.util.Comparator;

public class MinCostComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getCost() - o1.getCost();
    }
}
