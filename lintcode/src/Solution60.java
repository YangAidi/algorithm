/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 11:54
 **/
public class Solution60 {
    /**
     * @param a:      an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] a, int target) {
        // write your code here
        if (a.length == 0) {
            return 0;
        }
        return search(a, target, 0, a.length - 1);
    }

    public int search(int[] a, int target, int l, int r) {
        if (l <= r) {
            if(a[l]<target){
                return l+1;
            }
            return l;
        }
        int mid = (l + r) / 2;
        if (a[mid] == target) {
            return mid;
        } else if (a[mid] > target) {
            return search(a, target, l, mid - 1);
        } else {
            return search(a, target, mid + 1, r);
        }
    }
}
