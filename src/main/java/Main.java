import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList();
        Car car1 = new Car("Volvo", 100000, 200);
        Car car2 = new Car("HatchBack", 230000, 156);
        Car car3 = new Car("Bmw", 3400000, 250);
        Car car4 = new Car("Jip", 8000000, 350);
        Car car5 = new Car("SportCar", 200000000, 500);
        Car car6 = new Car("Sedan", 330000, 300);
        Car car7 = new Car("Bmx", 78000, 150);

        cars.addAll(List.of(car1, car2, car3, car4, car5, car6, car7));

//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//        cars.add(car5);
//        cars.add(car6);
//        cars.add(car7);

        System.out.println("==================Cars====================");
        cars.forEach(System.out::println);
        for (Car car: cars){
            car.getName();
        }
        Arrays.asList(cars).stream().forEach(car -> car.size());
        System.out.println("==========================================");

        Comparator maxCostComparator = new MaxCostComparator();
        Collections.sort(cars, maxCostComparator);

        System.out.println("\n===============sorted min=================");
        cars.forEach(System.out::println);
        System.out.println("==========================================");

        Comparator minCostComparator = new MinCostComparator();
        Collections.sort(cars, minCostComparator);

        System.out.println("\n===============sorted max=================");
        cars.forEach(System.out::println);
        System.out.println("==========================================");

    }
}
