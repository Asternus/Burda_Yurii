package com.burda.hw31.util;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public List<Integer> getNumbersList1(List<Integer> integerList) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (integerList.size() % 2 == 0) {
            for (int i = 0; i < integerList.size() / 2; i++) {
                primeNumbers.add(integerList.get(i));
            }
        } else {
            for (int i = 0; i < integerList.size() / 2 + 1; i++) {
                primeNumbers.add(integerList.get(i));
            }
        }
        return primeNumbers;
    }

    public List<Integer> getNumbersList2(List<Integer> integerList) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (integerList.size() % 2 == 0) {
            for (int i = integerList.size() - 1; i >= integerList.size() / 2; i--) {
                primeNumbers.add(integerList.get(i));
            }
        } else {
            for (int i = integerList.size() - 1; i >= integerList.size() / 2 + 1; i--) {
                primeNumbers.add(integerList.get(i));
            }
        }
        return primeNumbers;
    }

}
