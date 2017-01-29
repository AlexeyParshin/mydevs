package SWINGDEMOPACK;

import SWINGDEMOPACK.SwingDemo;

import javax.swing.*;


public class ExampleSWING {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}

