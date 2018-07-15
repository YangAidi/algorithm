public class Solution2 {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     * 这一题我最初的想法是如果碰到0结尾的数肯定结果出现一个0，5结尾的数能和2匹配也能生成一个。
     * 但是结果不对，后来想到100之类的可能会有两个0，所以又套了个循环。但是结果还不对。
     * 看了参考代码，知道了，有可能出现25这种，含有5的倍数，2是肯定够用的，偶数就可以。
     * 另外参考答案给的是直接 除以5，得到的倍数就是0-n内5的个数，然后再求25的个数，125的个数，依次类推！！！
     * 不用这个办法而从0-n进行循环还会超时。
     * long类型创建对象的时候应该在后面加上L（包装类）l(基本类型)。
     * 如果在程序中直接写一串数字，则是整形，含有小数点则是double
     * 今天再次碰到这个题目，竟然忘记了怎么做的。
     */
    public long trailingZeros(long n) {
        if(n==0)return 1;
        long k=0L;
        // write your code here, try to do it without arithmetic operators.
        while(n>0){
            k+=n/5;
            n/=5;
            //sum*=i;
        }
//            if(j%5==0&&j!=0)
//                ++k;

        return k;
    }
}