import java.lang.reflect.Array;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-28 18:41
 **/
public class Solution80 {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        int [] a=new int[100000];
        int m=a.length/2;
        for(int num:nums)
        {
//            if(num>0)
                a[m+num]++;
//            else
//                a[m+num]++;

        }
        int sum=0;
        for(int i=0;i<a.length;++i)
        {
            sum+=a[i];
            if(sum>=(nums.length+1)/2)
                return i-m;
        }
        return sum;
    }
}
