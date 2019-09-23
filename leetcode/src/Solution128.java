import java.util.HashSet;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 15:23
 **/
class Solution128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
            h.add(num);
        }
        int res =0;
        int temp=0;

        for (int num : h) {
            if(!h.contains(num-1)){
                temp =1;
                while (h.contains(++num)){
                    ++temp;
                }
                res = Math.max(res,temp);
            }
        }
        return res;
    }
}
