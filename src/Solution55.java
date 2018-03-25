import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 18:19
 * 在调用m.remove时，本来写的是char类型的b，会报错，应该用它的包装类
 **/
public class Solution55{
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        List<Character> m=new ArrayList<Character>();
        for(Character a:A.toCharArray())
        {
            m.add(a);
        }
        for(Character b:B.toCharArray())
        {
            if(m.contains(b)){
                m.remove(b);
                continue;
            }
            return false;
        }
        return  true;
    }
}
