/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-04 23:40
 **/

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
public class Solution104 {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if(lists==null){
            return null;
        }
        int k = lists.size();
        if(k==0)
        {
            return null;
        }
        if(k==1)
        {
            return lists.get(0);
        }

        PriorityQueue<Node> queue = new PriorityQueue<>(k, Comparator.comparingInt(o -> o.node.val));
        for(int i=0;i<k;++i) {
            if(lists.get(i)!=null) {
                queue.add(new Node(lists.get(i), i));
                lists.set(i,lists.get(i).next);
            }
        }


        ListNode head = new ListNode(-1);
        ListNode p=head;
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            p.next = poll.node;
            p=p.next;
            if(lists.get(poll.value)!=null){
                queue.add(new Node(lists.get(poll.value),poll.value));
                lists.set(poll.value,lists.get(poll.value).next);
            }
        }

        return head.next;
    }
    class Node{
        ListNode node;
        int value;
        public Node(ListNode node,int value){
            this.node=node;
            this.value=value;
        }
    }
}

