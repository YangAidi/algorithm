public class Solution2 {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        if(n==0)return 1;
        long k=0L;
        // write your code here, try to do it without arithmetic operators.
        while(n>0){
            k+=n/5;
            n/=5;
            //sum*=i;
        }
//            if(j%5==0&&j!=0)
//                ++k;

        return k;
    }
}