package com.burda.hw3.task1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class SumTest {

    private UserInput userInputMock;
    private Sum sum = new Sum();

    @Before
    public void setUp() {
        userInputMock = Mockito.mock(UserInput.class);
    }
    @Test
    public void retSum() {
        Mockito.when(userInputMock.getNumber()).thenReturn(123);
       int actual = sum.retSum(userInputMock);
       int expected = 6;
       assertEquals(expected, actual);
    }
    @Test
    public void retSumNeg() {
        Mockito.when(userInputMock.getNumber()).thenReturn(-1);
        int actual = sum.retSum(userInputMock);
        int expected = -1;
        assertEquals(expected, actual);
    }
}