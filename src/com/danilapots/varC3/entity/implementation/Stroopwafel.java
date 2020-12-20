package com.danilapots.varC3.entity.implementation;

import com.danilapots.varC3.entity.Dessert;

import java.util.Objects;

public class Stroopwafel extends Dessert {
    private static final int PARAMETERS_AMOUNT = 4;

    private final int syrup;
    private final int sugar;


    public Stroopwafel(int syrup, int sugar) {
        super("wafers", "butter");
        this.syrup = syrup;
        this.sugar = sugar;
    }

    @Override
    public int calculateCalories() {
        return 3 * syrup + 4 * sugar;
    }

    public int getSyrup() {
        return syrup;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public int getParametersAmount() {
        return PARAMETERS_AMOUNT;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(" with sugar = %d and syrup = %d.", sugar, syrup);
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
        Stroopwafel that = (Stroopwafel) o;
        return syrup == that.syrup &&
                sugar == that.sugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), syrup, sugar);
    }
}
