import swingdemopack.*;
import trainingpacks.*;
import javax.swing.*;


public class Example {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}