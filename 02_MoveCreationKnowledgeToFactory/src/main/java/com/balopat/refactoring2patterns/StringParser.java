package com.balopat.refactoring2patterns;

public class StringParser {
    private Parser parser;
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;

    public Node findNode(/* ... */){
        /* ... */

        return StringNode.createStringNode(textBuffer, textBegin, textEnd, parser.shouldDecodeNodes());
        /* ... */     
    }
}
