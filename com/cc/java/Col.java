package com.cc.java;

public class Col {
    public static String c( String c ) {
        switch ( c ) {
            case "#r":
                return "\u001b[31m";
            case "#g":
                return "\u001b[32m";
            case "#y":
                return "\u001b[33m";
            case "#b":
                return "\u001b[34m";
            case "#p":
                return "\u001b[35m";
            case "#c":
                return "\u001b[36m";
            default:
                return "\u001b[0m";
        }
    }
}
