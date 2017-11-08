import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication() {
        Doller five = new Doller(5);
        five.times();
        assertEquals(10, five.amount);
    }
}