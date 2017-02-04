package javaBookExamples.IOpack;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by dip17_000 on 27.01.2017.
 */
public class javaComp {
    public static void main(String[] args) {
        int i, j;
        int ind = 0;

        if (args.length != 2) {
            System.out.println("Wrong args.See description.");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();

                if (i <= 90 && i != -1)
                    i = i + 32;
                if (j <= 90 && i != -1)
                    j = j + 32;

                if (i != j && i != 0) {
                    System.out.println("The differ in " + (ind + 1));
                    break;
                } else if (i == 0) {
                    System.out.println("The differ in " + ind);
                    break;
                }
                ind++;
            } while (i != -1 && j != -1);
            if (i != j)
                System.out.println("Files are different");
            else
                System.out.println("Files are the same");

        } catch (IOException exc) {
            System.out.println("I/O error " + exc);
        }

    }
}
