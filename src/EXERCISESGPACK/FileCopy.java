package EXERCISESGPACK;

import java.io.*;

/**
 * Created by dip17_000 on 03.02.2017.
 */

class copyCl {
    private FileInputStream fin;
    private FileOutputStream fout;
    private String inFilename;
    private String outFilename;

    copyCl(String _inFilename, String _outFilename) {
        int ch;
        inFilename = _inFilename;
        outFilename = _outFilename;

        try {
            fin = new FileInputStream(inFilename);
            fout = new FileOutputStream(outFilename);
            do {
                ch = fin.read();
                if ((char) ch == ' ') {
                    fout.write((int) '-');
                } else if(ch != -1)
                    fout.write(ch);
            } while (ch != -1);

        } catch (IOException exc) {
            System.out.println(exc);
        } finally {
            try {
                fin.close();
                fout.close();
            } catch (IOException exc) {
                System.out.println(exc);
            }
        }
    }

    void showOutput() {
        String str;

        try (BufferedReader in = new BufferedReader(new FileReader(outFilename));) {
            do {
                str = in.readLine();
                if(str == null) break;

                System.out.println(str);
            } while (str != null);
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}

public class FileCopy {
    public static void main(String[] args) {
        copyCl cp = new copyCl("file1", "file2");
        cp.showOutput();
    }
}
