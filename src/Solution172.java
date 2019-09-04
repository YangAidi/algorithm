/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-03 16:12
 **/
public class Solution172 {

    /*
     * @param a: a list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] a, int elem) {
        // write your code here
        int i = 0, j = a.length - 1;
        while (i <= j) {
            while (i <= j && a[i] != elem) {
                ++i;
            }
            if (i <= j) {
                a[i] = a[j--];
            }
        }
        return i;
    }
}
