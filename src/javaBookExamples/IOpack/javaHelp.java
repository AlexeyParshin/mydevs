package javaBookExamples.IOpack;

import java.io.*;

/**
 * Created by dip17_000 on 01.02.2017.
 */
class Help {
    private String helpfile;

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpon(String what) throws IOException {
        int ch;
        String topic, info;

        BufferedReader fin = new BufferedReader(
                new FileReader(helpfile));
        do {
            ch = fin.read();

            if (ch == '#') {
                topic = fin.readLine();
                if (what.equals(topic)) {
                    do {
                        info = fin.readLine();
                        if (info != null) System.out.println(info);
                    } while (info != null
                            && !info.equals(""));
                    return true;
                }
            }
        } while (ch != -1);

        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Choose topic: ");
        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("IOException: " + exc);
        }
        return topic;
    }
}

public class javaHelp {
    public static void main(String[] args) {
        Help hlpObj = new Help("helpfile.txt");
        String topic;

        System.out.println("Java help\n" + "Enter a topic or exit");
        try {
            do {
                topic = hlpObj.getSelection();

                if (!topic.equals("exit") & !hlpObj.helpon(topic))
                    System.out.println("Topic is not found");

            } while (!topic.equals("exit"));
        } catch (IOException exc) {
            System.out.println("IOException: " + exc);
        }
    }
}