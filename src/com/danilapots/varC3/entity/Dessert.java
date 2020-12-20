package com.danilapots.varC3.entity;

import java.util.Objects;

public abstract class Dessert implements Nutritious {
    private final String firstComponent;
    private final String secondComponent;

    public Dessert(String firstComponent, String secondComponent) {
        this.firstComponent = firstComponent;
        this.secondComponent = secondComponent;
    }

    public String getFirstComponent() {
        return firstComponent;
    }

    public String getSecondComponent() {
        return secondComponent;
    }

    public abstract int getParametersAmount();

    @Override
    public String toString() {
        return "Dessert with components: " + firstComponent + ", " + secondComponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dessert dessert = (Dessert) o;
        return Objects.equals(firstComponent, dessert.firstComponent) &&
                Objects.equals(secondComponent, dessert.secondComponent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstComponent, secondComponent);
    }
}
