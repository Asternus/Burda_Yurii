package com.burda.hw3.task1;

public class Sum {

    public int retSum(UserInput userInput) {
        int temp = userInput.getNumber();
        int sum = 0;
        if (temp < 0) {
            return -1;
        } else {
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        return sum;
    }
}

