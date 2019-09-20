/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-15 10:17
 **/
public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        if (next == null) return String.valueOf(val);
        return String.valueOf(val) + "-" + next.toString();
    }
}
