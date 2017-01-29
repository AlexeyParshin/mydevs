package javaBookExamples.exceptionPack;

/**
 * Created by dip17_000 on 25.09.2016.
 */

class DemoArrays {
    private String[] nStrArray;
    private String[] dStrArray;
    private int nlgt;
    private int dlgt;

    DemoArrays() {
        nStrArray = "1,2,32,54,1,54,43".split(",");
        dStrArray = "0,34,0,12,54,25".split(",");
        nlgt = nStrArray.length;
        dlgt = dStrArray.length;
    }

    void showNumer() {
        for (String str : nStrArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    void showDenom() {
        for (String str : dStrArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    int get_nNumber(int _ind) {
        int intNum = Integer.parseInt(nStrArray[_ind]);
        return intNum;
    }

    int get_dNumber(int _ind) {
        int intDen = Integer.parseInt(dStrArray[_ind]);
        return intDen;
    }

    int getnumerLenght() {
        return nlgt;
    }

    int getdenomLenght() {
        return dlgt;
    }
}


public class excDemo {
    public excDemo() {
        DemoArrays obj = new DemoArrays();
        String res = new String();

        for (int i = 0; (i < obj.getnumerLenght()) && (i < obj.getdenomLenght()); i++) {
            try {
                res += String.format("%.2f", ((double) obj.get_nNumber(i) / (double) obj.get_dNumber(i)));
                if ((i != obj.getnumerLenght() - 1) && (i != obj.getdenomLenght() - 1)) {
                    res += ", ";
                }
            } catch (ArithmeticException exc) {
                res += "inf, ";
            }
        }
        obj.showNumer();
        obj.showDenom();
        System.out.println("\nAfter dividing: ");
        System.out.println(res);
    }

}
// upd