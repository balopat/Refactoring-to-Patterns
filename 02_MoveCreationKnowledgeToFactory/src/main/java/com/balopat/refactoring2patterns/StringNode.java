package com.balopat.refactoring2patterns;

public class StringNode implements Node {

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
        /* ... */
    }

    public StringNode() {
    }

    public static Node createStringNode(StringBuffer textBuffer, int textBegin, int textEnd, boolean shouldDecode) {
        if (shouldDecode){
            return new DecodingStringNode(new StringNode(textBuffer, textBegin, textEnd));
        }
        return  new StringNode(textBuffer, textBegin, textEnd);
    }
}
