package com.burda.hw3.task2;

import com.burda.hw3.task1.Sum;
import com.burda.hw3.task1.UserInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {
    private UserInputServ userInputServMock;
    Calculator calculator = new Calculator();

    @Before
    public void setUp() {
        userInputServMock = Mockito.mock(UserInputServ.class);
    }
    @Test
    public void giveResSum () {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('+');
        Mockito.when(userInputServMock.addSNu1()).thenReturn(10.0d);
        Mockito.when(userInputServMock.addSNu2()).thenReturn(20.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 30.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResMinus () {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('-');
        Mockito.when(userInputServMock.addSNu1()).thenReturn(20.0d);
        Mockito.when(userInputServMock.addSNu2()).thenReturn(10.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 10.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResMultiply () {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('*');
        Mockito.when(userInputServMock.addSNu1()).thenReturn(5.0d);
        Mockito.when(userInputServMock.addSNu2()).thenReturn(5.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 25.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResDiv() {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('/');
        Mockito.when(userInputServMock.addSNu1()).thenReturn(10.0d);
        Mockito.when(userInputServMock.addSNu2()).thenReturn(5.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = 2.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResNull() {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('0');
        double actual = calculator.giveRes(userInputServMock);
        double expected = -3.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResDefault() {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('&');
        double actual = calculator.giveRes(userInputServMock);
        double expected = -4.0d;
        assertEquals(expected, actual, 0.0d);
    }
    @Test
    public void giveResDivNull() {
        Mockito.when(userInputServMock.addSymbol()).thenReturn('/');
        Mockito.when(userInputServMock.addSNu1()).thenReturn(10.0d);
        Mockito.when(userInputServMock.addSNu2()).thenReturn(0.0d);
        double actual = calculator.giveRes(userInputServMock);
        double expected = -2.0d;
        assertEquals(expected, actual, 0.0d);
    }
}