package LeetCode;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-05-06 10:31
 **/
public class Solution829 {
//    public int consecutiveNumbersSum(int N) {
//        int res = 1;
//        for (double i = 2; i <= N; ++i) {
//            if (i%2==0){
//                int j= (int) (N/i);
//                double k=N/i;
//                if(k-j==0.5)
//                {
//                    if(j>=i/2) {
//                        res++;
//                    }
//                }
//            }else {
//                int j= (int) (N/i);
//                double k=N/i;
//                if(k-j==0.0)
//                {
//                    if(j>i/2) {
//                        res++;
//                    }
//                }
//            }
//        }
//        return res;
//    }
    public int consecutiveNumbersSum(int N) {

            int m=1;
            int accum=1;
            int count=0;

            while (accum<= N) {
                if ((N-accum)%m==0) ++count;
                ++m;
                accum=m*(m+1)>>1;
            }
            return count;
        }
//        int res=1;
//        int count=2;
//        for(int i=1;i<=N/2+1;++i)
//        {
//            int sum=i;
//            for(int j=i+1;j<=N/count+1;++j)
//            {
//                sum+=j;
//                if(sum==N)
//                {
//                    res++;
//                    break;
//                }
//                if(sum>N)
//                    break;
//            }
//        }
//        return res;
}
