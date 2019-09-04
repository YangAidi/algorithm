import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 10:36
 * 这个题目需要考虑的情况太多了，不写了。
 **/
public class Solution30 {
    /*    *//*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        for(int i=0;i<intervals.size();++i)
        {
            if(intervals.get(i).start>newInterval.end)
            {
                intervals.add(0,newInterval);
                break;
            }else if(intervals.get(i).start==newInterval.end)
            {
                intervals.set(0,new Interval(newInterval.start,intervals.get(i).end));
                break;
            }else if(true);
        }

        return  intervals;
    }
}