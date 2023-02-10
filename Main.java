import java.util.Arrays;

public class Main {
    public static int[] mystery2(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = { 2, 4, 6 };
        int[] result = mystery2(list);
        System.out.println(Arrays.toString(result));
    }
}
