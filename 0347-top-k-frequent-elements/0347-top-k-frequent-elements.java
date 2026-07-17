class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(var n : nums){
            int count = map.getOrDefault(n,0);
            count+=1;
            map.put(n,count);
        }
        // O(n)

        int[][] result = new int[map.size()][2];

        int idx =0;
        for(var s:map.entrySet()){
            result[idx][0] = s.getKey();
            result[idx][1] = s.getValue();
            idx++;
        }
        
        Arrays.sort(result,(a,b)-> b[1]-a[1]);


        int[] answer = new int[k];
        for(int i=0;i<k;i++){
            answer[i]=result[i][0];
        }

        return answer;
    }
}