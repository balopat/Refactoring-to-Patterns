package com.balopat.refactoring2patterns;

public class StringNodeParsingOption {
    private boolean shouldDecodeStringNodes;

    public StringNodeParsingOption() {
    }

    public void setShouldDecodeStringNodes(boolean shouldDecodeStringNodes) {
        this.shouldDecodeStringNodes = shouldDecodeStringNodes;
    }

    public boolean shouldDecodeStringNodes() {
        return shouldDecodeStringNodes;
    }
}