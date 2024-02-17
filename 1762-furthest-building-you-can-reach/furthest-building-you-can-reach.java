class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<heights.length-1;i++) {
            int diff = heights[i+1] - heights[i];
            if(diff <= 0) continue;
            pq.add(diff);
            if(pq.size() > ladders) bricks -= pq.poll();
            if(bricks < 0) return i;
        }
        return heights.length-1;
    }
}