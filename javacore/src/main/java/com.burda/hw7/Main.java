package com.burda.hw7;

import com.burda.hw7.model.Animal;
import com.burda.hw7.service.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Animal animal = userInputService.userInputAnimalTypeName();
        userInputService.doActions(animal);
    }
}
