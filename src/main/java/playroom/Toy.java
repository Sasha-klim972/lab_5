package playroom;
public abstract class Toy {
    private String name;
    private double price;
    private String ageGroup;

    public Toy(String name, double price, String ageGroup) {
        this.name = name;
        this.price = price;
        this.ageGroup = ageGroup;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getAgeGroup() { return ageGroup; }

    @Override
    public String toString() {
        return String.format("Іграшка: %-15s | Вік: %-4s | Ціна: %.2f грн", name, ageGroup, price);
    }
}