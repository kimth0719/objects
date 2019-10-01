package com.theater.step2_2;

import java.time.Duration;

public class Main {
    public static void main() {
        Movie starWars = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicy());
    }
}
