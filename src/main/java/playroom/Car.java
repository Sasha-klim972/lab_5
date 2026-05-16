package playroom;
public class Car extends Toy {
    private String size;

    public Car(String name, double price, String ageGroup, String size) {
        super(name, price, ageGroup);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Машинка (" + size + ")";
    }
}