package com.balopat.refactoring2patterns;

public class Parser {
    private boolean shouldDecode;

    public void setNodeDecoding(boolean shouldDecode){
        this.shouldDecode = shouldDecode;
    }

    public boolean shouldDecodeNodes(){
        return shouldDecode;
    }

}
