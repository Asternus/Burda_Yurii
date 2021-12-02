package com.burda.hw12.phone;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String phone = "016/161616";
        PhoneBook.PHONE_BOOK[0] = phone;
        PhoneBook.PHONE_BOOK[1] = "016/161617";
        PhoneBook.PHONE_BOOK[2] = "016/161618";

        System.out.println(PhoneBook.getSearch(phone));
    }
}
