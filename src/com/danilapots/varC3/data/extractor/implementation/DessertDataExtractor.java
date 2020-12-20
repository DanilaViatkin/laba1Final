package com.danilapots.varC3.data.extractor.implementation;

import com.danilapots.varC3.data.extractor.DataExtractor;

public class DessertDataExtractor extends DataExtractor {

    @Override
    protected boolean isValidData(char firstSymbol) {
        return Character.isAlphabetic(firstSymbol);
    }
}
