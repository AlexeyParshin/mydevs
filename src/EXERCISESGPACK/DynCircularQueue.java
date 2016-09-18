package EXERCISESGPACK;

import javaBookExamples.Interfaces.ICharQ;

/**
 * Created by dip17_000 on 17.09.2016.
 */
public class DynCircularQueue implements ICharQ {
    private int getloc, putloc;
    private char q[];
    private int numCh;

    public DynCircularQueue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
        numCh = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            char t[] = new char[q.length * 2];

            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }

        numCh++;
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        numCh--;
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        getloc = putloc = 0;
    }

    @Override
    public int getNumCh() {
        return numCh;
    }
}
