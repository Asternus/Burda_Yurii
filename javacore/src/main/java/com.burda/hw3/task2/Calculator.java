package com.burda.hw3.task2;

public class Calculator {
    private double result;

    public double giveRes(UserInputServ userInputServ) {
        char temp;
        do {
            System.out.println("Введите символ");
            char symbol = userInputServ.getSymbol();
            temp = symbol;
            if (symbol != '0') {
                System.out.println("Введите первое число");
                double number1 = userInputServ.getNumberFirst();
                System.out.println("Введите второе число");
                double number2 = userInputServ.getNumberSecond();
                switch (symbol) {
                    case ('+'):
                        result = (number1 + number2);
                        break;
                    case ('*'):
                        result = (number1 * number2);
                        break;
                    case ('/'):
                        if (number2 != 0) {
                            result = (number1 / number2);
                        } else {
                            result = -2.0d;
                        }
                        break;
                    case ('-'):
                        result = (number1 - number2);
                        break;
                    default:
                        result = -4.0d;
                }
            } else {
                result = -3.0d;
            }
            return result;
        } while (temp == '0');
    }
}
