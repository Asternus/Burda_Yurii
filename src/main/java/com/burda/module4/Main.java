package com.burda.module4;

import com.burda.module4.model.UserAccount;
import com.burda.module4.util.GameService;
import com.burda.module4.util.UserService;

public class Main {
    public static void main(String[] args) {

        GameService gameService = new GameService();

        UserAccount userAccount = new UserAccount();

        UserService userService = new UserService(gameService,userAccount);

        userService.doService();

        gameService.play(userService, userAccount);

    }
}