/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 10:11
 * 这题本来没有想到递归，看到挑战里面说用非递归实现。。。才想到的用递归。
 * continue的地方本来自己写的是return，后来答案错了，发现自己的答案比正确
 * 答案少，才想到，那里不能return，for循环结束了会自己return的。
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
/*public class Solution22 {

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> l=new ArrayList<>();
        flattenIml(l,nestedList);
        return l;
    }
    public void flattenIml (List<Integer> l,List<NestedInteger> nestedList)
    {
        for(NestedInteger n:nestedList)
        {
            if(n.isInteger()){
                l.add(n.getInteger());
                continue;
            }else {
                flattenIml(l,n.getList());
            }
        }
    }
}*/

