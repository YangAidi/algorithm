package huawei; /**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-07 16:54
 **/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] lables = new int[2000000];
    static int[] hasChild = new int[2000000];
    static int[] pounds = new int[2000000];
    static int[] values = new int[2000000];
    static int[] keys = new int[2000000];
    static int n;
    static int keyCount;
    static int valueCount;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.hasNext();
        // 节点数量n
        n = in.nextInt();
        index = 0;
        for (int i = 0; i < n; ++i) {
            lables[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            hasChild[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            pounds[i] = in.nextInt();
        }
        valueCount = in.nextInt();
        for (int i = 0; i < valueCount; ++i) {
            values[i] = in.nextInt();
        }
        keyCount = in.nextInt();
        for (int i = 0; i < keyCount; ++i) {
            keys[i] = in.nextInt();
        }

        int[] newValue = new int[n];
        int j=0;
        for(int i=0;i<n;++i){
            if(hasChild[i]==0){
                newValue[i]=1;
            }
        }

        for(int i=0;i<keyCount;++i)
        {
            for(int jj=n-1;jj>=0;--jj){
                if(lables[jj]==keys[i]){
                    if(hasChild[jj]==0){
                        System.out.println(newValue[jj]);
                        return;
                    }
                }
            }
        }
    }

    static void creatTree(){

    }

    static class Node {
        List<Node> child;
        int value;
        boolean isLeaf;

        public Node(List<Node> child, int value, boolean isLeaf) {
            this.child = child;
            this.value = value;
            this.isLeaf = isLeaf;
        }
    }

    static int index;

    static Queue queue = new LinkedList();
//    static void creatTree() {
//        while (--index>=0){
//            Node node=new Node(null,0,hasChild[index]==0);
//            queue.add(node);
//            if()
//        }
//        if(!node.isLeaf){
//            creatTree();
//        }
//    }


}
