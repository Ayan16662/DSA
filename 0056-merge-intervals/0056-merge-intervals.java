import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals by starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {

            // No overlap
            if (list.isEmpty() || list.get(list.size() - 1)[1] < interval[0]) {
                list.add(interval);
            } 
            // Overlap → merge
            else {
                list.get(list.size() - 1)[1] =
                    Math.max(list.get(list.size() - 1)[1], interval[1]);
            }
        }

        // Convert List<int[]> to int[][]
        return list.toArray(new int[list.size()][]);
    }
}