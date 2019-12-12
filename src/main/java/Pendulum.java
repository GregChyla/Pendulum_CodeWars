import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Pendulum {
    int[] pendulum(final int[] values) {
        Arrays.sort(values);
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(values[0]);
        for (int i = 1; i < values.length; i++) {
            if (i % 2 == 0) {
                queue.addFirst(values[i]);
            } else
                queue.addLast(values[i]);
        }
        return queue.stream().mapToInt(s -> s).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Pendulum().pendulum(new int[]{11, -16, -18, 13, -11, -12, 3, 18})));
    }
}