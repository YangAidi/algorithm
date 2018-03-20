/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-20 15:38
 * 这个感觉应该有更好的算法
 **/
public class Solution6 {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] C=new int[A.length+B.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<A.length&&j<B.length)
        {
                if(A[i]<B[j]) {
                    C[k] = A[i];
                    ++i;
                }else {
                    C[k]=B[j];
                    ++j;
                }
                ++k;
        }
        if(i<=A.length)
        {
            for (int m=i;m<A.length;++m)
            {
                C[k]=A[m];
                ++k;
            }
        }
        if(j<=B.length)
        {
            for (int m=j;m<B.length;++m)
            {
                C[k]=B[m];
                ++k;
            }
        }

        return C;
    }
}
