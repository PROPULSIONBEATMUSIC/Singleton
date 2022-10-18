public class Car {
    String name;
    int cost;
    int speed;

    public Car(String name, int cost, int speed) {
        this.name = name;
        this.cost = cost;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                '}';
    }
}