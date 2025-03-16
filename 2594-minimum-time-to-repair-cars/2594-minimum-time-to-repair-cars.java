class Solution {
    public long repairCars(int[] ranks, int cars) {
        long minRank = ranks[0];
        for (int rank : ranks) {
            if (rank < minRank) {
                minRank = Math.min(minRank, rank);
            }
        }
        long left = 1;
        long right = (long) minRank * cars * cars;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (repairPossibleCars(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean repairPossibleCars(int[] ranks, int cars, long time) {
        long totalCars = 0;
        for (int rank : ranks) {
            totalCars += (long) Math.sqrt(time / rank);
            if (totalCars >= cars) {
                return true;
            }
        }
        return false;
    }
}