package com.cc.java;

public class Tabs {
    private int oTab;
    public Tabs( int oTab ) { this.oTab = oTab; }
    public int getoTab() { return oTab; }
    public String getTabs( int oTab ) {
        switch ( oTab ) {
            case 1: return "\t";
            case 2: return "\t";
            case 3: return "\t\t\t";
            case 4: return "\t\t\t\t";
            default: return "";
        }
    }
}