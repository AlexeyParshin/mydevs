package trainingpacks;

/**
 * Created by dip17_000 on 17.06.2016.
 */
public class Kordan {
    public static double[] pol_root(double[] mass){
        double q,r,phi;
        double A[] = new double[3];
        q = 2*Math.pow(mass[1],3)/(27*Math.pow(mass[0],3)) - (mass[1]*mass[2])/(3*Math.pow(mass[0],2)) + mass[3]/mass[0];
        if(q > 0)
            r = Math.sqrt(Math.abs((3*mass[0]*mass[2] - mass[1]*mass[1])/(3*mass[0]*mass[0])));
        else
            r = -Math.sqrt(Math.abs((3*mass[0]*mass[2] - mass[1]*mass[1])/(3*mass[0]*mass[0])));

        phi = Math.acos(q/Math.pow(r,3));

        A[0] = -2*r*Math.cos(phi/3);
        A[1] = 2*r*Math.cos((3.14 - phi)/3);
        A[2] = 2*r*Math.cos((3.14 + phi)/3);

        /*System.out.println("q: " + q + " r: " + r);
        for (double i:A) {
            System.out.println(i + " ");
        }*/
        return A;

    }
}
