package com.danilapots.varC3.logic;

import com.danilapots.varC3.entity.Dessert;

import java.util.Comparator;
import java.util.List;

public class DessertCommandExecutor {
    private static final String PRINT_COMMAND = "-print";
    private static final String CALORIES_COMMAND = "-calories";
    private static final String SORT_COMMAND = "-sort";

    private final List<Dessert> desserts;

    public DessertCommandExecutor(List<Dessert> desserts) {
        this.desserts = desserts;
    }


    public void execute(String command) {
        switch (command) {
            case PRINT_COMMAND:
                printDesserts();
                break;
            case CALORIES_COMMAND:
                calculateCalories();
                break;
            case SORT_COMMAND:
                sortDesserts();
                break;
            default:
                System.out.println("Warning: No such command: " + command + "!");
        }
    }

    private void printDesserts() {
        for (Dessert dessert : desserts) {
            System.out.println(dessert);
        }
    }

    private void calculateCalories() {
        int calories = 0;
        for (Dessert dessert : desserts) {
            calories += dessert.calculateCalories();
        }
        System.out.println("Calories = " + calories);
    }

    private void sortDesserts() {
        desserts.sort(new Comparator<Dessert>() {
            @Override
            public int compare(Dessert o1, Dessert o2) {
                return Integer.compare(o1.getParametersAmount(), o2.getParametersAmount());
            }
        });
        System.out.println("Desserts sorted successfully!");
    }
}
