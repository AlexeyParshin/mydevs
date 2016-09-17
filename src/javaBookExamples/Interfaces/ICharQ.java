package javaBookExamples.Interfaces;

/**
 * Created by dip17_000 on 17.09.2016.
 */
public interface ICharQ {
    void put(char ch);

    char get();

    void reset();

    static void copy(char[] in,char[] out){
        for (int i = 0;i < in.length;i++)
            out[i] = in[i];
    }
}
