import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution44 solution=new Solution44();
        System.out.println(solution.minSubArray(new ArrayList<>(Arrays.asList(1, -1, -2, 1))));
    }
}
