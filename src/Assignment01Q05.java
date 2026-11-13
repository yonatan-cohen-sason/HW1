import java.util.Arrays;

public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int n = m.length;

        int[] distances = new int[n];
        Arrays.fill(distances, -1);

        int[] points = new int[n];
        int head = 0;
        distances[i] = 0;
        points[0] = i;
        int tail = 1;
        while (head < tail) {
            int current = points[head++];

            for (int k = 0; k < n; k++) {
                if (m[current][k] == 1 && distances[k] == -1) {
                    distances[k] = distances[current] + 1;

                    if (k == j) {
                        return distances[k];
                    }

                    points[tail++] = k;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}