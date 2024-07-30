class Solution {
    public boolean checkString(String s) {
        //aaaa //bbbbb // aaabbb // abaab
        int l =0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)=='b' ){
                for(int i =r ; i>= l ; i--){
                    if(s.charAt(i)=='a'){
                        return false;
                    }
                }
                return true;
            
        }else{
                l++;
            }
    }
        return true;
}
}