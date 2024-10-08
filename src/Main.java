import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1 задача
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float[] weight = {1.57f, 7.654f, 9.986f};
        int[] goal = {27, 32, 46, 58, 45, 87};
        // 2 задача
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < goal.length; i++) {
            System.out.print(goal[i]);
            if (i < goal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // 3 задача
        for (int i = numbers.length -1 ; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weight.length - 1; i >= 0 ; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = goal.length - 1; i >= 0; i--) {
            System.out.print(goal[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // 4 задача
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}