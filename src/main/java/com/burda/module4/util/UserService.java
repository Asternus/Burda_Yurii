package com.burda.module4.util;


import com.burda.module4.model.UserAccount;
import lombok.ToString;

import java.util.Scanner;

@ToString
public class UserService {
    private final Scanner scanner = new Scanner(System.in);
    private int maxHorse;
    private int bind;
    private double money;

    private GameService gameService;

    private UserAccount userAccount;

    public UserService(GameService gameService, UserAccount userAccount) {
        this.gameService = gameService;
        this.userAccount = userAccount;
    }

    public int getMaxHorse() {
        return maxHorse;
    }

    public int getBind() {
        return bind;
    }

    public double getMoney() {
        return money;
    }

    public void doService() {
        System.out.println("Please enter your name");
        userAccount.setUsername(scanner.nextLine());

        if (userAccount.getUsername().isBlank()) {
            doService();
        }

        int userAction;
        userAccount.addAllMoney(1000);
        userAccount.setMiddle();
        userAccount.addTotalWin(0);
        userAccount.addTotalLose(0);
        do {
            if (userAccount.getAllMoney() <= 0) {
                System.out.println("У вас закончились деньги");
                System.exit(0);
            }
            System.out.println("Your name = " + userAccount.getUsername());
            System.out.println("Your money = " + userAccount.getAllMoney());
            System.out.println("Your wins = " + userAccount.getTotalWin());
            System.out.println("Your loses = " + userAccount.getTotalLose());
            System.out.println("Your middle = " + userAccount.getMiddle());
            System.out.println("Input 1 if you want play");
            System.out.println("Input 2 if you want semaphore");
            System.out.println("Input 3 if you want my runnable");
            System.out.println("Input 4 if you want my testJoin");
            System.out.println("Input 5 if you want search by exit");

            userAction = scanner.nextInt();

            ThreadUtil threadUtil = new ThreadUtil();

            switch (userAction) {
                case 1 -> {
                    playGame();
                    gameService.play(this, userAccount);
                    System.out.println("-------------------------------");
                }
                case 2 -> threadUtil.semaphore();
                case 3 -> threadUtil.runnable();
                case 4 -> threadUtil.testJoin();
                case 5 -> {
                    System.exit(0);
                }
                default -> throw new IllegalStateException();
            }
        } while (true);
    }

    private void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количесво лошадей");

        maxHorse = scanner.nextInt();

        if (maxHorse < 3 || maxHorse > 30) {
            System.out.println("Введите корректное колличесво лошадей");
            playGame();
        }

        System.out.println("Введите номер лошади на которую Вы ставите");

        bind = scanner.nextInt();

        if (bind > maxHorse) {
            System.out.println("Номер лошади должен не привышать максимальное колличество");
            playGame();
        }

        System.out.println("Введите колличесво денег");
        money = scanner.nextDouble();

        if (money > userAccount.getAllMoney()) {
            System.out.println("Вы не можете ставить больше чем имеете");
            playGame();
        }
    }

}
