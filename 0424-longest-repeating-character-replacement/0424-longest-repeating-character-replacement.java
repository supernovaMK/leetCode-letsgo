class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int maxCount =0;
        int maxLength =0;
        int[] counts = new int[26];

        for(int right =0 ; right<s.length();right++){
            counts[s.charAt(right)-'A']++;
            maxCount=Math.max(maxCount,counts[s.charAt(right)-'A']);

            while(right-left+1-maxCount>k){
                counts[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);

        }

        return maxLength;
    }
}