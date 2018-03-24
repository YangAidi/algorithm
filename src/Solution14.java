/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-22 11:08
 * 想试试直接遍历能不能出结果，没想到真的可以，这测试样例很不严谨啊
 *写了个二分遍历，想着是如果mid那个点等于target就直接返回，但是这样
 * 的话就会出现后面的数字先被匹配到返回，所以应当再继续遍历下去。
 * 这样的话复杂度肯定就是logN了，无论如何都要遍历完，感觉有点浪费。
 * 但是为了获得最小的不得不这样做。
 **/
public class Solution14 {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int i=0;
        int j=nums.length-1;

        while (i<j)
        {
            int k=(i+j)/2;
            if(nums[k]>target)
            {
                j=k-1;
            }else if(nums[k]<target)
            {
                i=k+1;
            }else {
                j=k;
            }
        }
        if(nums[i]==target)return i;
        return -1;
    }
    public int binarySearch2(int[] nums, int target) {
        // write your code here
        int i=0;
        for(int num:nums)
        {

            if(num ==target)
            {
                return i;
            }
            ++i;
        }

        return -1;
    }
}