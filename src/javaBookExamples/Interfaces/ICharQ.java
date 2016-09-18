package javaBookExamples.Interfaces;

/**
 * Created by dip17_000 on 17.09.2016.
 */
public interface ICharQ {
    void put(char ch);

    char get();

    void reset();

    int getNumCh();

    static void copy(ICharQ in, ICharQ out) {
        int inNumCh = in.getNumCh();
        for (int i = 0; i < inNumCh; i++)
            out.put(in.get());
    }
}
