public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int num=0;
        num+=n/10;
        if(num%10>k) num++;
        return num;
    }
};