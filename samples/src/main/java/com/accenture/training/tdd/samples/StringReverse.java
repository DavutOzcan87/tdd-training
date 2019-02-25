package com.accenture.training.tdd.samples;

public class StringReverse {


    public String reserveString( String arg){
        StringBuilder sb = new StringBuilder();
        sb.append(arg);
        return sb.reverse().toString();
    }
}
