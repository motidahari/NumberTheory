import java.util.Arrays;
/*
 * Created by Moti Dahari
 */
public class PrimeNumbers {

    private boolean checkPrime(int num){
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }


    public void checkNumPrime(int num){
        System.out.println("check prime number");
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        System.out.println();

    }
    public int[] getPrimeNumbersInArray(int num){
        System.out.println("prime dividers of " + num + " in array");
        int[] arr = new int[0];
        int newNum = num;
        int i = 2;
        int index = 0;
        while(newNum != 1){
            if(newNum%i == 0){
                newNum/=i;
                arr = Arrays.copyOf(arr, arr.length +1);
                arr[index++] =i;

            }else{
                i+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        return arr;
    }

    public void getPrimeNumbersFromNum(int num){
        if(num <= 1) {
            System.out.println("the num is small or equal to 1");
            System.out.println();
            return;
        }
        System.out.println("prime dividers of " + num );
        int[] arr = new int[0];
        int newNum = num;
        int i = 2;
        int index = 0;
        while(newNum != 1){
            if(newNum%i == 0){
                newNum/=i;
                arr = Arrays.copyOf(arr, arr.length +1);
                arr[index++] =i;

            }else{
                i+=1;
            }
        }
        String str = "";
        int count = 1;
        for (i = 1; i < arr.length;i++){
            str+= arr[i-1];
            while(i < arr.length && arr[i] == arr[i-1] ){
                ++count;
                i++;
            }
            str+= "^" +  count ;
            count=1;
            if(i < arr.length){
                str+= " + ";
            }
            if((i+1) == arr.length){
                str+= arr[i] + "^" +  count;
            }

        }
        str+= " = " +  num;
        System.out.println(str);
        System.out.println();
    }
    public int[] getAllPrimeNumbersUntilNumInArray (int num) {
        System.out.println("get All Prime Numbers Until Num In Array");
        int[] arr = new int[0];
        if(num<1)return arr;
        int index = 0;
        for (int i = 2; i < num; i++){
            if(checkPrime(i)) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[index] = i;
                index++;
            }
        }
        System.out.println(num + " -> " + Arrays.toString(arr));
        System.out.println();
        return arr;
    }

}

