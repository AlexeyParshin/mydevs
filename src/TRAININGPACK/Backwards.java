package TRAININGPACK;

/**
 * Created by dip17_000 on 17.06.2016.
 */
class Backwards {
    String str;

    public Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if (idx != str.length() - 1)
            backward(idx + 1);
        System.out.print(str.charAt(idx));
    }
}
