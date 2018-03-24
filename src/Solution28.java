/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-24 17:54
 * 我的也是二分法啊，为啥过不了，好气啊。有时间看下哪里有优化的空间。
 **/
public class Solution28 {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length==0||matrix[0][0]>target||matrix[matrix.length-1][matrix[0].length-1]<target) return false;
        int i=0;
        int j=matrix.length-1;
        int m=0;
        int n=matrix[0].length-1;
        while (i<j)
        {
            int mid=(i+j)/2;
            if(i==mid) break;
            if(matrix[mid][0]<target){
                m=mid;
                continue;
            }
            if(matrix[mid][n]>target)
            {
                j=mid;
            }
        }
        while (m<n)
        {
            if(matrix[i][n]==target)return true;
            int mid=(m+n)/2;
            if(matrix[i][mid]>target)
            {
                n=mid-1;
                continue;
            }
            if(matrix[i][mid]<target)
            {
                m=mid+1;
                continue;
            }
            if (matrix[i][mid]==target)
            {
                return true;
            }
        }
        return false;
    }
}