import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 16:50
 * 这个题目略奇葩啊，不让用除法。
 **/
public class Solution50 {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> l = new ArrayList<>();
        for (int i = 0; i < nums.size(); ++i)
        {
            long m= 1L;
            for(int j=0;j<nums.size();++j)
            {
                if(i==j)continue;
                m*=nums.get(j);
            }
            l.add(m);
        }
        return l;
    }
}