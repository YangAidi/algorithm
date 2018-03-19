import java.lang.reflect.Array;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-19 17:33
 * 这个是纯暴力解开的，刚开始数组开的太大了，造成了报错
 * 应该想一个空间复杂度为1的算法
 **/
class Solution5 {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        int[] array=new int[999999];
        for(int a:array)
        {
            a=0;
        }
        int max=-999999999;
        for(int num:nums)
        {
            if(max<num)
                max=num;
            array[num]++;
        }
        int m=0;
        int s=0;
        for(int i=max;i>=0;--i)
        {
            if(array[i]<=0) continue;
            m+=array[i];
            if(m==k)
                s=i;
        }
        return s;
    }
};
