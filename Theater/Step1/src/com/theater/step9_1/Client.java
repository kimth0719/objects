package com.theater.step9_1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Client {

    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public Money getAvatarFee() {
        Movie avatar = factory.createAvatarMovie();
        return avatar.getFee();
    }
}
