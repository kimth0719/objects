package com.theater.step5_2;




import java.time.Duration;
import java.util.List;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    private List<PeriodCondition> periodConditions;
    private List<SequenceCondition> sequenceConditions;

    public Money calculateMovieFee(Screening screening) {
        if(isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }
        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return checkPeriodConditions(screening) || checkSequenceConditions(screening);
    }

    private boolean checkPeriodConditions(Screening screening) {
        return periodConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private boolean checkSequenceConditions(Screening screening) {
        return sequenceConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private Money calculateDiscountAmount() {
        switch (movieType) {
            case AMOUNT_DISCOUNT :
                return calculateAmountDiscountAmount();
            case PERCENT_DISCOUNT :
                return calcalatePercentDiscountAmount();
            case NONE_DISCOUNT :
                return calculateNoneDiscountAmount();
        }
        throw new IllegalStateException();
    }

    private Money calculateNoneDiscountAmount() {
        return discountAmount;
    }

    private Money calcalatePercentDiscountAmount() {
        return fee.times(discountPercent);
    }

    private Money calculateAmountDiscountAmount() {
        return Money.ZERO;
    }
}
