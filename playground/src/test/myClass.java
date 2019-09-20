package test;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 14:25
 **/

/**
 * Created by wangyajie on 18-2-28.
 */

public class myClass {

    public static void main(String [] args){
        long startTime = System.currentTimeMillis();
        for (int i = 2; i < 10000000; i++) {
            if (isPalindrome(i)){
                if (isPrimeNumber(i)){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("AccountTime: "+(System.currentTimeMillis()-startTime));
    }

    private static boolean isPrimeNumber(int num) {
        if (num<2 || num %2 ==0){
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i+=2) {
            if (num %i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        String numString = num+"";
        int low = 0;
        int high = numString.length()-1;
        while (low < high){
            if (numString.charAt(low) != numString.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
