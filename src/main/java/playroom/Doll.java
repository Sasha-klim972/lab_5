package playroom;
public class Doll extends Toy {
    private String material;

    public Doll(String name, double price, String ageGroup, String material) {
        super(name, price, ageGroup);
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Лялька (Матеріал: " + material + ")";
    }
}
