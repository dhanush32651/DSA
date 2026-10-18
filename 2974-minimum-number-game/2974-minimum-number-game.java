class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n= nums.length;
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        int arr [] = new int[n];
        int j=0;
        while(!pq.isEmpty()){
           int alice = pq.poll();
           int bob = pq.poll();
            arr[j]=bob;
            j++;
            arr[j]=alice;
            j++;
        }
        return arr;
    }
}