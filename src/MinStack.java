import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 11:44
 **/
public class MinStack {
    public MinStack() {
        // do intialization if necessary
    }

    private Stack<Integer> s1=new Stack<>();
    private Stack<Integer> s2=new Stack<>();

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        s1.push(number);
        if(s2.isEmpty()){
            s2.push(number);
        }else if(number<s2.peek()) {
            s2.push(number);
        }else {
            s2.push(s2.peek());
        }

    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        s2.pop();
        return s1.pop();
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        return s2.peek();
    }
}
