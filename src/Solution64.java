
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-26 09:00
 **/
public class Solution64 {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }
        while (i >= 0) {
            A[index--] = A[i--];
        }
        while (j >= 0) {
            A[index--] = B[j--];
        }
    }
    public void mergeSortedArray2(int[] a, int m, int[] b, int n) {
        // write your code here
        int i=0,j=0;
        for(;i<m;++i){
            if(a[i]>b[j]){
                move(a,m+n,i,b[j]);
                ++j;
                break;
            }
        }
        for(;j<n;++j){
            a[++i]=b[j];
        }
    }
    private void move(int a[],int m,int i,int j){
        System.arraycopy(a, i, a, i + 1, m - 1 - i);
        a[i]=j;
    }
}
