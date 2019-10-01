package com.theater.step5_5;

public class Reservation {

    private Customer customter;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customter, Screening screening, Money fee, int audienceCount) {
        this.customter = customter;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomter() {
        return customter;
    }

    public void setCustomter(Customer customter) {
        this.customter = customter;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount;
    }
}
