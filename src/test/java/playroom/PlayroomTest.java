package playroom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayroomTest {

    @Test
    void testAddToyAndBudget() throws BudgetExceededException {
        Playroom room = new Playroom(2, 1000.0);
        Toy toy = new Car("Машинка", 400.0, "3+", "Мала");
        room.addToy(toy);

        Toy expensiveToy = new Doll("Дорога лялька", 700.0, "6+", "Порцеляна");
        assertThrows(BudgetExceededException.class, () -> {
            room.addToy(expensiveToy);
        });
    }

    @Test
    void testSorting() throws BudgetExceededException {
        Playroom room = new Playroom(2, 1000.0);
        room.addToy(new Car("Б", 500.0, "3+", "Мала"));
        room.addToy(new Car("А", 200.0, "3+", "Мала"));

        room.sortToysByPrice();
    }
}