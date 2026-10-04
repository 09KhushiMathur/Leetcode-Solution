class Solution {
    public boolean checkValidString(String s) {
        int openmin = 0;
        int openmax = 0;
        for(char ch : s.toCharArray()){
            if(ch =='('){
                openmin++;
                openmax++;

            }else if(ch ==')'){
                openmin--;
                openmax--;
            }else{
                openmin--;
                openmax++;
            }
            if(openmax<0){
                return false;
            }
            openmin = Math.max(0,openmin);
            

        }
        return openmin==0;

        
    }
}