/*
 * Created by Moti Dahari
 */
public class Euclid {
    public int[] EuclidSolve(int p, int q) {
        int [] arr = euclid2(p, q);
        String str = "(g,x,y) = ("+arr[0]+", "+ arr[1] + " , " +arr[2]+")";
        System.out.println("euclid");
        System.out.println("gcd(" + p + ", " + q + ") = " + arr[0]);
        System.out.println(arr[1] + "(" + p + ") + " + arr[2] + "(" + q + ") = " + arr[0]);
        System.out.println();
        return arr;
    }
    private int[] euclid2(int p, int q) {
        if (q == 0)
            return new int[] { p, 1, 0 };
        int[] vals = euclid2(q, p % q);
        int d = vals[0];
        int a = vals[2];
        int b = vals[1] - (p / q) * vals[2];
        return new int[] { d, a, b };
    }
    private int[] euclid24(int p, int q) {
        if (q == 0)
            return new int[] { p, 1, 0 };

        int[] vals = euclid2(q, p % q);
        int d = vals[0];
        int a = vals[2];
        int b = vals[1] - (p / q) * vals[2];
        return new int[] { d, a, b };
    }
}



