package EXERCISESGPACK;

import javaBookExamples.Interfaces.ICharQ;

/**
 * Created by dip17_000 on 17.09.2016.
 */
public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;
    private int numCh;

    public CircularQueue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
        numCh = 0;
    }

    @Override
    public void put(char ch) {
        if ((putloc == getloc - 1) | (putloc == q.length - 1) & (getloc == 0)) {
            System.out.println(" - Очередь заполнена ");
            return;
        }

        numCh++;
        putloc++;
        if (putloc == q.length)
            putloc = 0;
        q[putloc] = ch;
    }

    @Override
    public void reset() {
        getloc = putloc = 0;
    }

    @Override
    public int getNumCh() {
        return numCh;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста ");
            return (char) 0;
        }
        numCh--;
        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}
