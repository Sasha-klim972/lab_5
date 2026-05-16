package playroom;
import java.util.Arrays;
import java.util.Comparator;

public class Playroom {
    private Toy[] toys;
    private int currentCount;
    private double budget;
    private double totalSpent;

    public Playroom(int maxToys, double budget) {
        this.toys = new Toy[maxToys];
        this.currentCount = 0;
        this.budget = budget;
        this.totalSpent = 0.0;
    }

    public void addToy(Toy toy) throws BudgetExceededException {
        if (currentCount >= toys.length) {
            System.out.println("Кімната вже заповнена!");
            return;
        }
        if (totalSpent + toy.getPrice() > budget) {
            throw new BudgetExceededException("Недостатньо коштів для " + toy.getName());
        }
        toys[currentCount++] = toy;
        totalSpent += toy.getPrice();
    }

    public void sortToysByPrice() {
        Arrays.sort(toys, 0, currentCount, Comparator.comparingDouble(Toy::getPrice));
    }

    public void findToysByPriceRange(double min, double max) {
        System.out.println("\n--- Пошук від " + min + " до " + max + " грн ---");
        for (int i = 0; i < currentCount; i++) {
            if (toys[i].getPrice() >= min && toys[i].getPrice() <= max) {
                System.out.println(toys[i]);
            }
        }
    }

    public void printInfo() {
        System.out.println("\n--- Стан кімнати (Витрачено: " + totalSpent + " / " + budget + ") ---");
        for (int i = 0; i < currentCount; i++) {
            System.out.println(toys[i]);
        }
    }
}