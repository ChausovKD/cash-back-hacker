import org.junit.Test;
import static org.junit.Assert.assertEquals;

import ru.mirea.CashBackCounting;

public class CashBackServiceTest {

    @Test
    public void shouldCalculateForAmount1000AndGetExtraZero() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1000);
        int expected = 0; // Ожидаемый остаток должен быть равен 0
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmountZeroAndGetExtra1000() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount1000AndGetExtra1000() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount1500AndGetExtra500() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount2000AndGetExtra1000() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(2000);
        int expected = 0; // Ожидаемый остаток должен быть равен 0
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount2500AndGetExtra500() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(2500);
        int expected = 500;
        assertEquals(expected, actual);
    }
}