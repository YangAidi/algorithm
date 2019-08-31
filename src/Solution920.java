/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-31 21:07
 **/

import java.util.Comparator;
import java.util.List;

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution920 {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        if(intervals==null||intervals.isEmpty()||intervals.size()==1){
            return true;
        }
        intervals.sort(Comparator.comparingInt(o -> o.start));

        for(int i=0;i<intervals.size()-1;++i){
            if(intervals.get(i).end>intervals.get(i+1).start){
                return false;
            }
        }
        return true;
    }
}
