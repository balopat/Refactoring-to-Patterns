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

    public Node createStringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
        if (shouldDecodeStringNodes){
            return new DecodingStringNode(new StringNode(textBuffer, textBegin, textEnd));
        }
        return  new StringNode(textBuffer, textBegin, textEnd);
    }
}