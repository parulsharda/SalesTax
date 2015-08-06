package com.salestax;

import java.util.ArrayList;

public class EntryPoint {

    public static void main(String args[])
    {
        ArrayList<String> notToadd = new ArrayList<String>();
        ArrayList<String> toAdd = new ArrayList<String>();
        IO io = new IO(notToadd,toAdd);
        io.acceptInput();
        io.acceptItems(notToadd,toAdd);
    }
}
