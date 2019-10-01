package com.theater.step5_3;

public class PeriodCondition implements DiscountCondition {
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
