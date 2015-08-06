package com.salestax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class IOTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void checkTheInputMsgToAcceptTheNumberOfItems() {
        ArrayList<String> notToAdd = new ArrayList<String>();
        ArrayList<String> toAdd = new ArrayList<String>();

        IO io = new IO(notToAdd,toAdd);
        io.acceptInput();
        assertEquals("Enter the Number of Items:", outContent.toString());
    }


    @Test
    public void checkTheInputMsgToAcceptTheItems() {
        ArrayList<String> notToAdd = new ArrayList<String>();
        ArrayList<String> toAdd = new ArrayList<String>();

        IO io = new IO(notToAdd,toAdd);
        io.acceptInput();
        assertEquals("\nEnter the Item Details:\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }
}


