package com.danilapots.varC3.data.extractor.implementation;

import com.danilapots.varC3.data.extractor.DataExtractor;

public class CommandExtractor extends DataExtractor {
    private static final char COMMAND_CHAR = '-';

    @Override
    protected boolean isValidData(char firstSymbol) {
        return firstSymbol == COMMAND_CHAR;
    }
}
