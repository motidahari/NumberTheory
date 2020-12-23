// Java program to check for solutions of
// diophantine equ
import java.io.*;
/*
 * Created by Moti Dahari
 */
class LinearDiophantineEquations {
    public void solution(int a, int b, int n)
    {
        System.out.println("the solve of: " + a+"*x +" + b+"*y = " +n );

        // traverse for all possible values
        for (int i = 0; i * a <= n; i++)
        {

            // check if it is satisfying the equation
            if ((n - (i * a)) % b == 0)
            {
                System.out.println("x = " + i +
                        ", y = " +
                        (n - (i * a)) / b);
                return ;
            }
        }

        System.out.println("No solution");
    }

} 
  
