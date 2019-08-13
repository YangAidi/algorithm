//package pdd;
//
//import java.util.Scanner;
//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2019-08-11 15:50
// **/
//public class Test1 {
//    package pdd; /**
//     * @program: LintCode
//     * @author: YangAidi
//     * @create: 2019-08-07 16:54
//     **/
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//    public class Main {
//
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            //in.hasNext();
//            // 节点数量n
//            int n = in.nextInt();
//            int k = in.nextInt();
//            String s = in.next();
//            char[] chars = s.toCharArray();
//            int[] array = new int[chars.length];
//            for (int i = 0; i < array.length; ++i) {
//                array[i] = chars[i] - '0';
//            }
//            int[] hash = new int[10];
//            for (int a : array) {
//                hash[a]++;
//            }
//            int cost = Integer.MAX_VALUE;
//            int[] res = new int[n];
//            int maxNum = -1;
//            int left = 0;
//            int right = 9;
//            int rightCount=0;
//            for (int num = 0; num < 10; ++num) {
//                int i = num + 1;
//                int j = num - 1;
//                int count = k - hash[num];
//                int tempCost = 0;
//                int rightCountTemp=0;
//                while (count > 0 && (j > 0 || i < 10)) {
//                    if (j > 0) {
//                        if (count - hash[j] > 0) {
//                            tempCost += hash[j] * (num - j);
//                            count -= hash[j];
//                        } else {
//                            tempCost += count * (num - j);
//                            break;
//                        }
//                        --j;
//                    }
//
//                    if (i < 10) {
//                        if (count - hash[i] > 0) {
//                            tempCost += hash[i] * (i - num);
//                            count -= hash[i];
//                            rightCountTemp+=hash[i];
//                        } else {
//                            tempCost += count * (i - num);
//                            rightCountTemp+=count;
//                            break;
//                        }
//                        ++i;
//                    }
//                }
//                if (tempCost < cost) {
//                    cost = tempCost;
//                    maxNum = num;
//                    left = j;
//                    right = i;
//                    rightCount=rightCountTemp;
//                }
////            int changeCount = k - hash[num];
////            int leaveCount = n - hash[num];
////            int[] temp = array.clone();
////            int tempCost = 0;
////            for (int i = 0; i < temp.length; ++i) {
////                if (changeCount == 0) {
////                    break;
////                }
////                if (temp[i] > num) {
////                    tempCost += temp[i] - num;
////                    temp[i] = num;
////                    --changeCount;
////                    --leaveCount;
////                } else if (temp[i] < num && leaveCount > changeCount) {
////                    --leaveCount;
////
////                } else if (temp[i] < num && leaveCount == changeCount) {
////                    tempCost += num-temp[i];
////                    temp[i] = num;
////                    --changeCount;
////                    --leaveCount;
////                }
////            }
////            if (tempCost < cost) {
////                cost = tempCost;
////                res=temp;
////            }
//            }
//            for (int i = 0; i < res.length; ++i) {
//                int current = array[i];
//                if (current >= left && current < maxNum) {
//                    res[i] = maxNum;
//                }else if(current<=right&&current>maxNum&&rightCount-->0){
//                    res[i]=maxNum;
//                }else {
//                    res[i]=current;
//                }
//            }
//
//            System.out.println(cost);
//            String ress = "";
//            for (int i = 0; i < res.length; ++i) {
//                ress += res[i];
//            }
//            System.out.println(ress);
//        }
//
//    }
//
//}
