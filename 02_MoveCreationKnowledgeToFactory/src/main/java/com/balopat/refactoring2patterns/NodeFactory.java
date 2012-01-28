package com.balopat.refactoring2patterns;

public class NodeFactory {
    //1. this is already a factory so nothing to change
    public Node createStringNode(StringBuffer textBuffer, int textBegin, int textEnd, boolean shouldDecode) {
        if (shouldDecode){
            return new DecodingStringNode(new StringNode(textBuffer, textBegin, textEnd));
        }
        return  new StringNode(textBuffer, textBegin, textEnd);
    }
}
