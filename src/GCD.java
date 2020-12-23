import java.util.*;
import java.lang.*;
/*
 * Created by Moti Dahari
 */
public class GCD {
        // extended Euclidean Algorithm
        private int check(int a, int b) {
            int result = 1;
            while(b >= (a+a)){
                a += a;
                result++;
            }
            return result;
        }
    public int gcd_solve(int a, int b) {
        System.out.println("gcd");
        int result;
            if(a>=b) result = gcd2(b,a);
            else result = gcd2(a,b);

        System.out.println("GCD(" + a +  " , " + b+ ") = " + result);
        System.out.println();
        return result;
    }
        private int gcd2(int a, int b) {
            if (a == 0)
                return b;
            System.out.println(b + " = " + a + "*" + check(a,b) + " +" + b%a);
            return gcd2(b%a, a);
        }
        // Driver Program


    }

