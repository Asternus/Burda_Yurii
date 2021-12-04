package com.burda.hw12;

import java.util.Random;

public class UserExceptionMethod {


    public void userMethod() throws UserInputException, UserArgumentException, UserIllegalException {
        Random random = new Random();
        final int number = random.nextInt();
        if (number > 10) {
            throw new UserInputException("Error 1");
        } else if (number != 0) {
            throw new UserArgumentException("Error 2");
        } else {
            throw new UserIllegalException("Error 3");
        }
    }
}
