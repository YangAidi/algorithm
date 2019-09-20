/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-14 13:04
 * <p>
 * 这个题目坑爹的地方是,创建队列的时候，输入的n，n是数组的大小还是队列的容量！！！一直WA，看了输入参数，发现是连续输入了五个，那n=5，n肯定是队列容量了，所以数组大小应该是6
 **/
public class CircularQueue {
    int n;
    int[] array;
    int begin;
    int end;

    public CircularQueue(int n) {
        // initialize your data structure here
        ++n;
        this.n = n;
        array = new int[n];
        begin = 0;
        end = 0;
    }

    /**
     * @return: return true if the array is full
     */
    public boolean isFull() {
        // write your code here
        return (end + 1) % n == begin;
    }

    /**
     * @return: return true if there is no element in the array
     */
    public boolean isEmpty() {
        // write your code here
        return end == begin;
    }

    /**
     * @param element: the element given to be added
     * @return: nothing
     */
    public void enqueue(int element) {
        // write your code here
        array[end] = element;
        end = ++end % n;
    }

    /**
     * @return: pop an element from the queue
     */
    public int dequeue() {
        // write your code here
        int res = array[begin];
        begin = ++begin % n;
        return res;
    }
}
