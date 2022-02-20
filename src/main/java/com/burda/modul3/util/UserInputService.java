package com.burda.modul3.util;

import java.util.Scanner;

public class UserInputService {
    private final Scanner scanner = new Scanner(System.in);

    public void doService(Service service) {
        int userAction;
        do {
            System.out.println("Input 0 if you exit");
            System.out.println("Input 1 if you want search by word");
            System.out.println("Input 2 if you want get most popular equipment");
            System.out.println("Input 3 if you want get most popular service");
            System.out.println("Input 4 if you want get list of top messages");
            System.out.println("Input 5 if you want get list of top internet");
            System.out.println("Input 6 if you want get list of top call");
            System.out.println("Input 7 if you want get list activity");
            System.out.println("Input 8 if you want get gender count");
            System.out.println("Input 9 if you want get most popular tariff");
            System.out.println("Input yours number :");
            userAction = scanner.nextInt();

            switch (userAction) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    System.out.println("Input word");
                    String word = scanner.nextLine();
                    service.getMessageByWord(word).forEach(System.out::println);
                    System.out.println("-------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("Most popular equipment :");
                    System.out.println(service.getMostPopularEquipment());
                    System.out.println("-------------------------------");
                    break;
                }
                case 3: {
                    System.out.println("Most popular service :");
                    System.out.println(service.mostPopularService());
                    System.out.println("-------------------------------");
                    break;
                }
                case 4: {
                    System.out.println("List of top messages :");
                    service.getListOfTopMessages().forEach(System.out::println);
                    System.out.println("-------------------------------");
                    break;
                }
                case 5: {
                    System.out.println("List of top internet :");
                    service.getListOfTopInternet().forEach(System.out::println);
                    System.out.println("-------------------------------");
                    break;
                }
                case 6: {
                    System.out.println("List of top call :");
                    service.getListOfTopCall().forEach(System.out::println);
                    System.out.println("-------------------------------");
                    break;
                }
                case 7: {
                    System.out.println("List of activity :");
                    service.getListActivity().forEach(System.out::println);
                    System.out.println("-------------------------------");
                    break;
                }
                case 8: {
                    System.out.println("Get gender count :");
                    System.out.println(service.getGenderCount());
                    System.out.println("-------------------------------");
                    break;
                }
                case 9: {
                    System.out.println("List of top messages :");
                    System.out.println(service.getMostPopularTariff());
                    System.out.println("-------------------------------");
                    break;
                }
                default:
                    throw new IllegalStateException();
            }
        } while (userAction != 0);
    }
}
