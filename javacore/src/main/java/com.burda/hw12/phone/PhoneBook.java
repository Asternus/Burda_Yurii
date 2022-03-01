package com.burda.hw12.phone;

import java.util.Optional;

public class PhoneBook {
    public static final String[] PHONE_BOOK = new String[3];

    public static Optional<Integer> getSearch(String phone) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i].equals(phone)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}


