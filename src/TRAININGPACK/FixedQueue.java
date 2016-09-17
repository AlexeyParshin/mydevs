package TRAININGPACK;

import javaBookExamples.Interfaces.ICharQ;

/**
 * Created by dip17_000 on 17.09.2016.
 */
public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        getloc = putloc = 0;
    }
}
