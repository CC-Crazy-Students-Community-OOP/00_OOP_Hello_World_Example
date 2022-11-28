package com.cc.java;

public class Out {
    // public output left aligned
        // public output method for String
            public static void op( String oS ) { System.out.println( oS ); }
        // public output method for integer
            public static void op( int oI ) { System.out.println( oI ); }
        // public output method for double
            public static void op( double oD ) { System.out.println( oD ); }
        // public output method for float
            public static void op( float oF ) { System.out.println( oF ); }
        // public output method for char
            public static void op( char oC ) { System.out.println( oC ); }
        // public output method with no arguments
            public static void op() { System.out.println( "Output was called, but no argument was given" ); }

    // public output left aligned
        // set object of Tab
            Tabs tab = new Tabs( 1 );
        
        // public output method for String
        public static void op( String oS, int oT ) { 
            System.out.println( 2 + oS ); 
        }



    // public output method for colors
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