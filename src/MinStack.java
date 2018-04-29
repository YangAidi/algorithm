/*
import java.util.HashMap;
import java.util.Stack;

*/
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-20 17:39
 **//*

public class MinStack {
    private Stack<Integer> stack;
    private int minIndex =0;
    private HashMap<Integer,int[]> hashMap=new HashMap();
    public MinStack() {
        // do intialization if necessary
        stack=new Stack();
    }

    */
/*
     * @param number: An integer
     * @return: nothing
     *//*

    public void push(int number) {
        // write your code here
        if(stack.empty()){
            hashMap.put(minIndex,new int[]{number, minIndex++});
        }else if(number<hashMap.get(minIndex -1)[1]){
            hashMap.put(minIndex,new int[]{number, minIndex++});
        }
        stack.push(number);
    }

    */
/*
     * @return: An integer
     *//*

    public int pop() {
        // write your code here
        int nuym stack.pop();
    }

    */
/*
     * @return: An integer
     *//*

    public int min() {
        // write your code here
        return minIndex;
    }
}
*/
