package com.danilapots.varC3.entity.implementation;

import com.danilapots.varC3.entity.Dessert;

import java.util.Objects;

public class Pancake extends Dessert {
    private static final int PARAMETERS_AMOUNT = 3;

    private final int pancakeAmount;

    public Pancake(int pancakeAmount) {
        super("Pancake", "Syrop");
        this.pancakeAmount = pancakeAmount;
    }

    @Override
    public int calculateCalories() {
        return 86 * pancakeAmount;
    }

    @Override
    public int getParametersAmount() {
        return PARAMETERS_AMOUNT;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" and pancakeAmount = %d.", pancakeAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Pancake pancake = (Pancake) o;
        return pancakeAmount == pancake.pancakeAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pancakeAmount);
    }
}
