/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-02-27 10:49
 **/
public class Solution1086 {
    /**
     * @param A: a string
     * @param B: a string
     * @return: return an integer
     * 枚举A重复的次数
     */
    public int repeatedStringMatch(String A, String B) {
        String tempS = A;
        int count = 1;
        while(A.length() < B.length()){
            A += tempS;
            count++;
        }
        if(A.contains(B)) {
            return count;
        }
        A=A+tempS;
        if(A.contains(B)) {
            return count+1;
        }
        return -1;
    }
}
