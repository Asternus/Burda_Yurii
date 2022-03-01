package com.burda.hw17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        boolean date = Stream.of("2000/01/08", "2002/02/09", "2021/01/08")
                .map(d -> LocalDate.parse(d, dateTimeFormatter))
                .anyMatch(localDate -> localDate.getYear() == 2021);
        System.out.println(date);
    }
}