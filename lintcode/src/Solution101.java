/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-04 11:21
 **/
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-04 11:11
 * WrongAnswer的原因有两个，第一个是在判断是否是连续两个重复的时候
 * 每次应该前进一步，而不是两步，前进两步会把连续三个的也给算进去了
 * 还有就是当第一次时，不应该去进入下面的else，会把所有的数组都变成
 * 一样的
 **/
public class Solution101 {
    public int removeDuplicates(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int size = 0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] != A[size]) {
                A[++size] = A[i];
            }else if(i!=0&&A[i+1] != A[size]){
                A[++size] = A[i];
            }
        }
        if(A[size]!=A[A.length-1]||A[size]!=A[size-1])
            A[++size]=A[A.length-1];
        return size + 1;
    }
}
