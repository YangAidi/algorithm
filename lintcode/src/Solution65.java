/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-15 13:33
 **/
public class Solution65 {
    public double findMedianSortedArrays(int A[], int B[]) {
        int n = A.length + B.length;

        if (n % 2 == 0) {
            return (
                    findKth(A, 0, B, 0, n / 2) +
                            findKth(A, 0, B, 0, n / 2 + 1)
            ) / 2.0;
        }

        return findKth(A, 0, B, 0, n / 2 + 1);
    }

    // find kth number of two sorted array
    private static int findKth(int[] a, int startofa,
                               int[] b, int startofb,
                               int k){
        if (startofa >= a.length) {
            return b[startofb + k - 1];
        }
        if (startofb >= b.length) {
            return a[startofa + k - 1];
        }

        if (k == 1) {
            return Math.min(a[startofa], b[startofb]);
        }

        int i = startofa + k / 2 - 1 < a.length
                ? a[startofa + k / 2 - 1]
                : Integer.MAX_VALUE;
        int j = startofb + k / 2 - 1 < b.length
                ? b[startofb + k / 2 - 1]
                : Integer.MAX_VALUE;

        if (i < j) {
            return findKth(a, startofa + k / 2, b, startofb, k - k / 2);
        } else {
            return findKth(a, startofa, b, startofb + k / 2, k - k / 2);
        }
    }
}
