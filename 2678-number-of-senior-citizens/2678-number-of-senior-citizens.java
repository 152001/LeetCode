class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i =0 ; i<details.length ; i++){
            String a = details[i].charAt(11) +  "" + details[i].charAt(12);
            int b = Integer.parseInt(a);
            if(b>60){
                count++;
            }
        }
        return count;
    }
}