/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-21 16:26
 * 考研408的原题，唯一的变化就是offset变了下。
 * 还有就是对于一些特殊情况的处理。比如超出数组大小，是应该取余，我本来是直接给return了。
 **/
public class Solution8 {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
//        if(offset<=0||offset>=str.length)
//            return;
        if(str.length==0) return;
        offset=offset%str.length;
        offset=str.length-offset;
        revert(str,0,offset-1);
        revert(str,offset,str.length-1);
        revert(str,0,str.length-1);
    }
    private void revert(char[] str,int i,int j)
    {
        char c;
        for(;i<=j;++i,--j)
        {
            c=str[i];
            str[i]=str[j];
            str[j]=c;
        }

    }
}
