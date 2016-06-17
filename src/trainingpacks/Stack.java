package trainingpacks;

/**
 * Created by dip17_000 on 17.06.2016.
 */
public class Stack {
    private char q[];
    private int putloc, getloc;

    public Stack(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    public Stack(Stack ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        System.arraycopy(ob.q,0,q,0,ob.q.length);
        /*for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];*/
    }

    public Stack(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) push(a[i]);
        System.out.println("Array has put");
    }

    void push(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Стек заполнен");
            return;
        }

        q[putloc] = ch;
        putloc++;
        getloc = putloc;
    }

    char pop() {
        if (getloc == 0) {
            System.out.println(" - Стек пуст");
            return (char) 0;
        }
        getloc--;
        return q[getloc];
    }
}
