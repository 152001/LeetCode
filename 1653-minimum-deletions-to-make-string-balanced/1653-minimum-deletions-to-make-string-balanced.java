class Solution {
    public int minimumDeletions(String s) {
       int[] dp = new int[s.length()+1];
        int i =1;
        int b_count = 0;
        
        for(int j =0 ; j<s.length(); j++){
            if(s.charAt(j)=='a'){
                dp[i] = Math.min(dp[i-1]+1,b_count);
            }else{
                dp[i] = dp[i-1];
                b_count++;
            }
            i++;
        }
        return dp[s.length()];
    }
}