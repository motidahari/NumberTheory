import java.util.Arrays;
/*
 * Created by Moti Dahari
 *
        get Prime Numbers In Array - מביא מערך של הפירוק לראשוניים של המספר
        check Num Prime - אומר האם המספר הוא ראשוני או לא
        get All Prime Numbers Until Num In Array - מביא מערך של כל המספרים הראשוניים עד המספר
        get Prime Numbers From Num - מביא את הפירוק לראשוניים במעריכית
        return gcd - מביא את הGCD של מספר
        gcd solve - פתרון מלא של GCD
        Euclid Solve - אוקלידס המורחב
        Calculation of modular equivalence - מציאת נציג קנוני של מספר בחזקה גבוהה ע"י המרה לבינארי ושימוש בנוסחה
        chinese- משפט הסיני
        Fermat’s little theorem- פרמה הקטן
        Carmichael Numbers- מחזיר האם מספר הוא מספר קרמייקל
        LCM - מביא LCM של 2 מספרים
        Linear Diophantine Equations - פתרון משוואה דיופנטית
 */

public class test {
        public static boolean checkNumPrime(int p,int q){
                boolean flag = true;
                for(int i = 2; i <= p/2 || i <= q/2; ++i) {
                        if(i < p/2) {
                                if(p%i == 0 ) {
                                        flag =false;
                                        break;
                                }
                        }
                        if(i < q/2) {
                                if(q%i == 0 ) {
                                        flag =false;
                                        break;
                                }
                        }
                }
                return flag;
        }
        public static boolean isHighFactorInRange(int n, int low, int high ) {
                int i =low,p=0,q=0;
                while(i != high ){
                        if(n%i == 0){
                                p = i;
                                q = n/p;
                                if(q <= high && p <= high){
                                        if(checkNumPrime(q,p)){
                                                System.out.println("n = " + n);
                                                System.out.println("q = " + q);
                                                System.out.println("p = " + p);
                                                System.out.println();
                                                return true;
                                        }
                                        else{
                                                return false;
                                        }
                                }
                        }
                        i++;
                }
                return false;
        }
        public static void findFactors(int n, int low, int high ) {
                isHighFactorInRange( n, low, high);
        }




       /* public static void main(String[] args) {

for(int i =0; i < 10000 ; i++)
                findFactors(i,1,200);
        }*/
        public static void main(String[] args) {
        int a,b;
        a=100;
        b=200;

        LinearDiophantineEquations  linearDiophantine = new LinearDiophantineEquations();
        ModularEquivalence modular = new ModularEquivalence();
        PrimeNumbers prime = new PrimeNumbers();
        Carmichael carmichael = new Carmichael();
        Chinese chinese = new Chinese();
        Euclid euclid = new Euclid();
        GCD gcd = new GCD();
        Fermat fermat = new Fermat();
        LCM lCM = new LCM();


        gcd.gcd_solve(10000000, 7000005);


//        for(int i=2; i< 1000 ; i++){
//            gcd.gcd_solve(i, i*i);
//        }

        //get Prime Numbers In Array
        prime.getPrimeNumbersInArray(20);
        //check Num Prime
        prime.checkNumPrime(19);
        //get All Prime Numbers Until Num In Array
        prime.getAllPrimeNumbersUntilNumInArray(20);
        //get Prime Numbers From Num
        prime.getPrimeNumbersFromNum(20);

        //gcd solve
        gcd.gcd_solve(173, 1050);

        //LCM
        lCM.lcm(72,120);

        //Euclid Solve
        euclid.EuclidSolve(9, 15);

        //Calculation of modular equivalence
        modular.Calculation_of_modular_equivalence(3,209,11);

        //chinese
        int[] constraints = {2,3,4,5}; //put modular contraints here
        int[] mods = {5,7,9,11}; //put moduli here
        chinese.chinese(constraints,mods);

        //Fermat’s little theorem
        fermat.modInverse(3, 11);

        //Carmichael Numbers
        carmichael.isCarmichaelNumber(8);//false
        carmichael.isCarmichaelNumber(561);//false
        carmichael.isCarmichaelNumber(1105);//false
                
        //Linear Diophantine Equations
        // a=3 b=6 c=9
        // 3x + 6y = 9
        linearDiophantine.solution(3,6,9);

           // linearDiophantine.solution(31,-52,3);
         //   linearDiophantine.solution(31,52,3);

        }

        
}

