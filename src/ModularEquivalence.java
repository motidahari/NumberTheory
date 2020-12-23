import java.util.Arrays;
/*
 * Created by Moti Dahari
 */
public class ModularEquivalence {
    public void Calculation_of_modular_equivalence(int base, int exponent, int modulo) {
        System.out.println("Calculation of modular equivalence");
        String a;
        String binaryExponent = Integer.toString(exponent,2);
        int [] d = new int [binaryExponent.length()];
        for (int i =0; i < d.length; i++){
            a = "" + binaryExponent.charAt(i);
            d[i] =  Integer.parseInt(a);
        }
        System.out.println("binaryExponent of "+exponent+ " = " + Arrays.toString(d));
        int c = 1,temp,index=0,power;
        for (int j =0; j < d.length; j++){
            power = (int)(Math.pow(c,2));
            power *= ((int)(Math.pow(base,d[j])));
            temp = power;
            while((power-modulo) > 0){
                power -= modulo;
            }
            System.out.println(c+"^"+2+" * "+base+"^"+d[j]+" = " + temp + " ≡ " +power+ "  mod "+modulo);
            c = power;
        }
        System.out.println();
        System.out.println("result -> " + base+"^"+exponent+" ≡ "+ c +" mod "+modulo);
        System.out.println();

    }
}

