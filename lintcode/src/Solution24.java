import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-30 21:46
 **/
public class Solution24 {
    /*
     * @param capacity: An integer
     */
    public Solution24(int capacity) {
        // do intialization if necessary
        size = capacity;
    }

    private Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> count = new HashMap<>();
    private Map<Integer, ArrayList<Integer>> countList = new HashMap<>();
    private int min = -1;
    int size = 0;
    private int now = 0;


    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void set(int key, int value) {
        // write your code here
        ++now;
        if (now > size) {
            Integer remove = countList.get(min).remove(0);
            count.remove(remove);
            map.remove(remove);
            --now;
        }
        map.put(key, value);
        int n = count.get(key) == null ? 0 : count.get(key);
        ArrayList<Integer> list = countList.get(n);
        if (list == null) {
            list = new ArrayList<>();
            list.add(key);
        } else {
            list.add(key);
        }
        countList.put(0,list);
        count.put(key, 0);
        if (min < 0) {
            min = 0;
        }
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        Integer value = map.get(key);
        if (value == null) {
            return -1;
        }
        Integer n = count.get(key);
        ArrayList<Integer> l= countList.get(n);
        Integer i = key;
        l.remove(i);
        if (min == n && countList.size()==1) {
            ++min;
        }
        count.put(key, ++n);
        ArrayList<Integer> list = countList.get(n);
        if (list == null) {
            list = new ArrayList<>();
            list.add(key);
        } else {
            list.add(key);
        }
        list.add(key);
        countList.put(n,list);
        return value;
    }
}
