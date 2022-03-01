package burda.hw3.task2;

import com.burda.hw3.task2.Calculator;
import com.burda.hw3.task2.UserInputServ;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private UserInputServ userInputServMock;
    private Calculator calculator = new Calculator();

    @Before
    public void setUp() {
        userInputServMock = Mockito.mock(UserInputServ.class);
    }
    @Test
    public void giveResSum () {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('+');
        Mockito.when(userInputServMock.getNumberFirst()).thenReturn(10.0d);
        Mockito.when(userInputServMock.getNumberSecond()).thenReturn(20.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 30.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResMinus () {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('-');
        Mockito.when(userInputServMock.getNumberFirst()).thenReturn(20.0d);
        Mockito.when(userInputServMock.getNumberSecond()).thenReturn(10.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 10.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResMultiply () {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('*');
        Mockito.when(userInputServMock.getNumberFirst()).thenReturn(5.0d);
        Mockito.when(userInputServMock.getNumberSecond()).thenReturn(5.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 25.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResDiv() {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('/');
        Mockito.when(userInputServMock.getNumberFirst()).thenReturn(10.0d);
        Mockito.when(userInputServMock.getNumberSecond()).thenReturn(5.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 2.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResNull() {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('0');
        double actual = calculator.giveRes(userInputServMock);
        double expected = -3.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResDefault() {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('&');
        double actual = calculator.giveRes(userInputServMock);
        double expected = -4.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResDivNull() {
        Mockito.when(userInputServMock.getSymbol()).thenReturn('/');
        Mockito.when(userInputServMock.getNumberFirst()).thenReturn(10.0d);
        Mockito.when(userInputServMock.getNumberSecond()).thenReturn(0.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = -2.0d;
        assertEquals(expected, actual, 0.0d);
    }
}