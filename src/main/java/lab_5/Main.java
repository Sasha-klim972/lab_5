package lab_5;
import playroom.*;
public class Main {
    public static void main(String[] args) {
        Playroom room = new Playroom(5, 1500.0);

        try {
            room.addToy(new Car("Hot Wheels", 120.0, "3-6", "Мала"));
            room.addToy(new Doll("Barbie", 450.0, "6+", "Пластик"));
            room.addToy(new Block("Lego Classic", 600.0, "6+", "Синій"));
            room.addToy(new Car("RC Truck", 400.0, "6+", "Велика"));
            // Ця викличе помилку, бо бюджет 1500
        } catch (BudgetExceededException e) {
            System.err.println("\n[Exception]: " + e.getMessage());
        }

        room.printInfo();
        room.sortToysByPrice();
        System.out.println("\nПісля сортування:");
        room.printInfo();
        room.findToysByPriceRange(100, 500);
    }
}