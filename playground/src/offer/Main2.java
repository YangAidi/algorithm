package offer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-11 15:58
 **/
public class Main2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] input = inputStr.split(" ");
        int totalDisk = Integer.parseInt(input[0]);
        int totalMemory = Integer.parseInt(input[1]);
        List<Service> services = parseServices(input[2].split("#"));
        int output = solution(totalDisk, totalMemory, services);
        System.out.println(output);
    }

    private static int solution(int totalDisk, int totalMemory, List<Service> services) {
        visit = new boolean[services.size()];
        maxDisk = totalDisk;
        maxMem = totalMemory;

        // TODO Write your code here
        for (int i = 0; i < services.size(); ++i) {
            Arrays.fill(visit, false);
            dfs(services, i, 0, 0, 0, 0);
        }

        return max;
    }

    private static int max = Integer.MIN_VALUE;
    private static int maxDisk = Integer.MIN_VALUE;
    private static int maxMem = Integer.MIN_VALUE;
    private static boolean[] visit;

    private static void dfs(List<Service> list, int now, int count, int res, int disk, int mem) {
        if (res > max && disk <= maxDisk && mem <= maxMem){
            max = res;
        }
            for (int i = 0; i < list.size(); ++i) {
                if (!visit[i] && now != i) {
                    Service s = list.get(i);
                    visit[i] = true;
                    dfs(list, i, count + 1, res + s.users, disk+s.disk, mem+s.memory);
                    visit[i] = false;
                }
            }
    }

    private static List<Service> parseServices(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList<Service>(0);
        }
        List<Service> services = new ArrayList<>(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String[] serviceArr = strArr[i].split(",");
            int disk = Integer.parseInt(serviceArr[0]);
            int memory = Integer.parseInt(serviceArr[1]);
            int users = Integer.parseInt(serviceArr[2]);
            services.add(new Service(disk, memory, users));
        }
        return services;
    }

    static class Service {
        private int disk;

        private int memory;

        private int users;

        public Service(int disk, int memory, int users) {
            this.disk = disk;
            this.memory = memory;
            this.users = users;
        }

        public int getDisk() {
            return disk;
        }

        public void setDisk(int disk) {
            this.disk = disk;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getusers() {
            return users;
        }

        public void setusers(int users) {
            this.users = users;
        }
    }
}
