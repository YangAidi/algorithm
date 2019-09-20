/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 12:57
 **/
public class Solution37 {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        return  number%10*100+number/100+number%100/10*10;
    }
}