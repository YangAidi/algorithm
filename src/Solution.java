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
            m=n%10;
            n=n/10;
            if(m>k)
                num++;
            num+=n;
            if(n>k)
                num+=Math.pow(10,j);
            if(n==k) {
                double num2=(m + 1) * Math.pow(10, j - 1);
                num+=num2;
                break;
            }
            ++j;
        }
        return num;
    }
};