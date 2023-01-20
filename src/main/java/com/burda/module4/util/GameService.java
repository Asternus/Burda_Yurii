package com.burda.module4.util;

import com.burda.module4.model.UserAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameService {
   public void play(UserService userService, UserAccount account) {
       ExecutorService executor = Executors.newFixedThreadPool(userService.getMaxHorse());

       List<Callable<String>> list = new ArrayList<>();

       for (int i = 0; i < userService.getMaxHorse(); i++) {
           Callable<String> callable = new Hippodrome();
           list.add(callable);
       }

       try {
           String result = executor.invokeAny(list);
           System.out.println(result);
           if (result.equals(("pool-1-thread-") + userService.getBind())) {
               account.addAllMoney(userService.getMoney() * 3);
               account.addTotalWin(1);
               account.setMiddle();
               System.out.println("You WIN");
           } else {
               System.out.println("You lose");
               account.addTotalLose(1);
               account.setMiddle();
               account.addAllMoney(- userService.getMoney());
           }
       } catch (InterruptedException | ExecutionException e) {
           e.printStackTrace();
       } finally {
           executor.shutdown();
       }
   }

}
