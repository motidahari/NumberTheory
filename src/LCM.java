public class LCM {
    public int lcm(int n1, int n2) {
        System.out.println("Find LCM of two Numbers: (" + n1+ "," + n2+")");
        int lcm;
        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;
        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                System.out.println();
                break;
            }
            ++lcm;
        }
        return lcm;
    }
}