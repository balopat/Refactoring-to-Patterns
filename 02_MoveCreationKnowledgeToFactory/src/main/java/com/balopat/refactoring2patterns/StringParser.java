package com.balopat.refactoring2patterns;

public class StringParser {
    private Parser parser;
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;

    public Node findNode(/* ... */){
        /* ... */
        NodeFactory nodeFactory = new NodeFactory();
        return nodeFactory.createStringNode(
                textBuffer,
                textBegin,
                textEnd,
                parser.getStringNodeParsingOption().shouldDecodeStringNodes()
        );
        /* ... */     
    }
}
