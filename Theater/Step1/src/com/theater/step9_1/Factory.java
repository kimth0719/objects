package com.theater.step9_1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Factory {

    public Movie createAvatarMovie() {
        return new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))
                ));
    }
}
