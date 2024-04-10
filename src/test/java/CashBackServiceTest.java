import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;

import ru.mirea.CashBackCounting;

public class CashBackServiceTest {

    ////////////////
    // JUnit 4 Tests
    ////////////////
    @DisplayName("JUnit 4 test for calculating cashback when amount is 0")
    @Test
    public void JUnit4_shouldCalculateForAmountZeroAndGetExtraZero() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    // JUnit 4 Test
    @DisplayName("JUnit 4 test for calculating cashback when amount is 1000")
    @Test
    public void JUnit4_shouldCalculateForAmount1000AndGetExtraZero() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    // JUnit 4 Test
    @DisplayName("JUnit 4 test for calculating cashback when amount is 1500")
    @Test
    public void JUnit4_shouldCalculateForAmount1500ZeroAndGetExtra500() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    //////////////////////
    // JUnit Jupiter Tests
    //////////////////////

    @DisplayName("JUnit Jupiter test for calculating cashback when amount is 0")
    @Test
    public void JUnit_Jupiter_shouldCalculateForAmountZeroAndGetExtraZero() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    // JUnit Jupiter Test
    @DisplayName("JUnit Jupiter test for calculating cashback when amount is 1000")
    @Test
    public void JUnit_Jupiter_shouldCalculateForAmount1000AndGetExtraZero() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    // JUnit Jupiter Test
    @DisplayName("JUnit Jupiter test for calculating cashback when amount is 1500")
    @Test
    public void JUnit_Jupiter_shouldCalculateForAmount1500AndGetExtra500() {
        CashBackCounting service = new CashBackCounting();
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }
}
