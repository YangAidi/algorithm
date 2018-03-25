import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 16:59
 * 从孟祥哲学长那学的split函数立了大功。
 **/
public class Solution53 {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        String[] ss=s.split(" ");
        int i=-1;
        for(String sss:ss)
        {
            if(!sss.isEmpty())
            {
                ss[++i]=sss;
            }
        }
        System.out.println(Arrays.toString(ss));
        String ssss= "";
        for(;i>=0;--i)
        {
            ssss+=ss[i]+" ";
        }
        return ssss;
    }
}
