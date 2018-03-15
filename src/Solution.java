public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int num=0;
        int j=1;
        int m;
        while (n > 0) {
            n=n/10;
            m=n%10;
            if(m>=k)
                num++;
            num+=n;
            if(n>k)
                num+=Math.pow(10,j);
            if(n==k)
                num+=m*Math.pow(10,j-1);
            ++j;
        }
        return num;
    }
};