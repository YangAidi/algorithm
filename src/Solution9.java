import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-21 17:01
 * 大水题。
 **/
public class Solution9 {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List <String> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0){
                if(i%5==0)
                    l.add("fizz buzz");
                else
                    l.add("fizz");
            }else if(i%5==0)
                l.add("buzz");
            else
                l.add(String.valueOf(i));
        }
        return l;
    }
}
