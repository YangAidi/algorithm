import java.util.TreeMap;

class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    MyCalendar() {
        calendar = new TreeMap();
    }

    public boolean book(int start, int end) {
        Integer previous = calendar.floorKey(start), next = calendar.ceilingKey(start);
        if ((previous == null || calendar.get(previous) <= start) && (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}


//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2019-09-07 17:08
// *
// * 有一个测试用例过不去
// *
// **/
//class MyCalendar {
//
//    public MyCalendar() {
//
//    }
//
//    List<Integer[]> list = new ArrayList<>();
//
//    private int find(int n, int l, int r) {
//        if(list.isEmpty()){
//            return -1;
//        }
//
//        if (l >= r) {
//            if(n<list.get(l)[0]) {
//                return l - 1;
//            }else {
//                return l;
//            }
//        }
//        int mid = (l + r) / 2;
//        if (list.get(mid)[0] > n) {
//            return find(n, l, mid - 1);
//        } else if (list.get(mid)[0] == n) {
//            return mid;
//        } else {
//            return find(n, mid+1, r);
//        }
//    }
//
//    public boolean book(int start, int end) {
//        int n = find(start,0,list.size()-1)+1;
//        if(n>=1&&!list.isEmpty()){
//            if(list.get(n-1)[1]>start){
//                return false;
//            }
//        }
//        if(list.size()>n+1){
//            if(list.get(n)[0]<end){
//                return false;
//            }
//        }
//        list.add(n,new Integer[]{start,end});
//
//        return true;
//    }
//}
//
///**
// * Your MyCalendar object will be instantiated and called as such:
// * MyCalendar obj = new MyCalendar();
// * boolean param_1 = obj.book(start,end);
// */
