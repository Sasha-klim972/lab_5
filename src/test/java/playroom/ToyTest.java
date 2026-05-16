package playroom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ToyTest {

    @Test
    void testCarCreation() {
        Car car = new Car("Блискавка", 500.0, "3-6", "Середня");
        assertEquals("Блискавка", car.getName());
        assertEquals(500.0, car.getPrice());
        assertTrue(car.toString().contains("Машинка"));
    }

    @Test
    void testDollCreation() {
        Doll doll = new Doll("Барбі", 800.0, "6+", "Пластик");
        assertEquals("Барбі", doll.getName());
        assertTrue(doll.toString().contains("Лялька"));
    }
}