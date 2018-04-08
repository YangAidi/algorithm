package LeetCode;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-08 09:34
 **/
public class Solution821 {
    public double largestTriangleArea(int[][] points) {
        if(points==null||points.length<3)return 0;
        double max=-0.1;
        for(int i=0;i<points.length;++i)
        {
            for (int j=i+1;j<points.length;++j)
            {
                for (int k=j+1;k<points.length;++k)
                {
                    double now =mianJi(points[i],points[j],points[k]);
                    if(now>max)
                        max=now;
                }
            }
        }

        return max;
    }
    double mianJi(int[] A, int[] B, int[] C) {
        return Math.abs((B[0]-A[0])*(C[1]-A[1]) - (B[1]-A[1])*(C[0]-A[0]))/2.0;
    }
}