class Solution {
   public void fun(String digits,int idx, int n, HashMap<Character,String>map,ArrayList<String>diary,List<String>res){
    if(idx == n){
        String ans = "";
        for(String s: diary){
            ans +=s ;
        }
        res.add(ans);
        return;
    }
    String choices = map.get(digits.charAt(idx));
    for(int j = 0 ;j<choices.length();j++){
        diary.add(String.valueOf(choices.charAt(j)));
        fun(digits,idx+1,n,map,diary,res);
        diary.remove(diary.size()-1);

    }

   }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        int idx = 0;
        int n = digits.length();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        ArrayList<String> diary = new ArrayList<>();
        fun(digits,0,n,map,diary,res);
        return res;

    }
}