package com.balopat.refactoring2patterns;

public class Parser {
    private StringNodeParsingOption stringNodeParsingOption = new StringNodeParsingOption();

    public StringNodeParsingOption getStringNodeParsingOption() {
        return stringNodeParsingOption;
    }

    public void setStringNodeParsingOption(StringNodeParsingOption stringNodeParsingOption) {
        this.stringNodeParsingOption = stringNodeParsingOption;
    }
}
