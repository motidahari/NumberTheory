
/*
 * Created by Moti Dahari
 */
public class Fermat {
    public int __gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return __gcd(b, a % b);
        }
    }

    // To compute x^y under modulo m
    public int power(int x,int y,int m) {
        if (y == 0)
            return 1;
        int p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        return (y % 2 == 0) ? p : (x * p) % m;
    }

    // Function to find modular
    // inverse of a under modulo m
    // Assumption: m is prime
    public void modInverse(int a, int m) {
        if (__gcd(a, m) != 1) {
            System.out.print("Inverse doesn't exist");
            System.out.println();
            System.out.println();
        } else {
            // If a and m are relatively prime, then
            // modulo inverse is a^(m-2) mode m
            System.out.print("Modular multiplicative inverse is " +power(a, m - 2, m));
            System.out.println();
            System.out.println();
        }
    }
}

