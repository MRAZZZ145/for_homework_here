package com.demo;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {


    @Test
    void shouldOpen() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // wtf
        LocalDate localDate = LocalDate.parse("18.02.2024", formatter);

        assertEquals(localDate.getDayOfWeek(), DayOfWeek.SUNDAY);

        //noinspection ResultOfMethodCallIgnored
        localDate.getDayOfWeek();
    }
}
