import java.util.HashMap;
import java.util.Map;

public class java {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> countMap = count(arr);
        System.out.println(countMap);
    }

    public static Map<Integer, Integer> count(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int elment : arr) {
            if (count.containsKey(elment)) {
                count.put(elment, count.get(elment) + 1);
            } else {
                count.put(elment, 1);
            }
        }
        return count;
    }
}