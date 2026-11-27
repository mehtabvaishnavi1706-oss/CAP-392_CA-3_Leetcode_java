class RecentCounter {

    int[] requests;
    int start;
    int end;

    public RecentCounter() {
        requests = new int[10000];
        start = 0;
        end = 0;
    }

    public int ping(int t) {

        requests[end] = t;
        end++;

        while (start < end && requests[start] < t - 3000) {
            start++;
        }

        return end - start;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
