/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-21 17:17
 * 输入检测真的是麻烦
 * KMP知道大概意思，但是写不出来也是硬伤
 **/
public class Solution13 {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
        if(target==null)return -1;
        if(target.isEmpty())return 0;
        if(source==null||source.isEmpty())return -1;
        char[] a1=source.toCharArray();
        char[] a2=target.toCharArray();

        for(int i=0;i<=a1.length-a2.length;++i)
        {
            int j=0;
            int index=1;
            while (j<a2.length)
            {
                if(a1[i+j]==a2[j])
                {
                    ++j;
                }else
                {
                    index=0;
                    break;
                }

            }
            if(index==1)
                return i;
        }
        return -1;
    }
}
