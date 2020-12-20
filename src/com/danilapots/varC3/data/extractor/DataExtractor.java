package com.danilapots.varC3.data.extractor;

import java.util.ArrayList;
import java.util.List;

public abstract class DataExtractor {

    //template method
    public List<String> extract(String[] args) {
        List<String> specificData = new ArrayList<>();
        for (String argument : args) {
            char firstSymbol = argument.charAt(0);
            if (isValidData(firstSymbol)) {
                specificData.add(argument);
            }
        }
        return specificData;
    }

    protected abstract boolean isValidData(char firstSymbol);
}
