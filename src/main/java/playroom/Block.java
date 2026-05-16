package playroom;
public class Block extends Toy {
    private String color;

    public Block(String name, double price, String ageGroup, String color) {
        super(name, price, ageGroup);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Кубик (Колір: " + color + ")";
    }
}
