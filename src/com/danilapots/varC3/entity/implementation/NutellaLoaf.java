package com.danilapots.varC3.entity.implementation;

import com.danilapots.varC3.entity.Dessert;

public class NutellaLoaf extends Dessert {
    private static final int CALORIES_AMOUNT = 2;
    private static final int PARAMETERS_AMOUNT = 2;

    public NutellaLoaf() {
        super("nutella", "loaf");
    }

    @Override
    public int calculateCalories() {
        return CALORIES_AMOUNT;
    }

    @Override
    public int getParametersAmount() {
        return PARAMETERS_AMOUNT;
    }
}
