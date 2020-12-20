package com.danilapots.varC3.data.creator;

import com.danilapots.varC3.entity.Dessert;
import com.danilapots.varC3.entity.implementation.NutellaLoaf;
import com.danilapots.varC3.entity.implementation.Pancake;
import com.danilapots.varC3.entity.implementation.Stroopwafel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DessertCreator {
    private static final String DESERT_PACKAGE = "com.danilapots.varC3.entity.implementation.";

    public Dessert createDessert(String dessertData) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException {
        int parametersIndex = dessertData.indexOf("(");
        String className = dessertData.substring(0, parametersIndex);

        Class dessertClass = Class.forName(DESERT_PACKAGE + className);
        String parameters = dessertData.substring(parametersIndex + 1, dessertData.length() - 1);
        String[] dessertParameters = parameters.split(",");

        return createDessertByParameters(dessertClass, dessertParameters);
    }

    private Dessert createDessertByParameters(Class dessertClass, String[] dessertParameters) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        Dessert dessert;
        Constructor constructor;
        int parametersAmount = dessertParameters.length;
        String firstParameterStr = dessertParameters[0];
        boolean isFirstParameterExist = !firstParameterStr.equals("");
        if (isFirstParameterExist) {
            int firstParameter = Integer.parseInt(firstParameterStr);
            if (parametersAmount > 1) {
                int secondParameter = Integer.parseInt(dessertParameters[1]);
                constructor = dessertClass.getConstructor(int.class, int.class);
                dessert = (Stroopwafel)constructor.newInstance(firstParameter, secondParameter);
            } else {
                constructor = dessertClass.getConstructor(int.class);
                dessert = (Pancake)constructor.newInstance(firstParameter);
            }
        } else {
            constructor = dessertClass.getConstructor();
            dessert = (NutellaLoaf)constructor.newInstance();
        }
        return dessert;
    }
}
