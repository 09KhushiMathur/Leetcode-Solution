class Solution {
    public void read(int [] arr,int h, int m, int c,int idx,List<String>res,int turnedOn){
         if(turnedOn == c){
            if(h<=11 && m <=59){
                res.add(h +":"+ String.format("%02d",m));
                return;

            }
            return;
        }
        for(int i =idx ;i<arr.length;i++){
            if(i<4){
                h = h+arr[i];
                c = c+1;
                read(arr,h,m,c,i+1,res,turnedOn);
                h = h-arr[i];
                c = c-1;
            }else{
                m = m+arr[i];
                c = c+1;
                read(arr,h,m,c,i+1,res,turnedOn);
                m = m-arr[i];
                c = c-1;

            }
        }
        return;

    }
    public List<String> readBinaryWatch(int turnedOn) {
        int [] arr = {8,4,2,1,32,16,8,4,2,1};
        List<String> res = new ArrayList<>();
         read(arr,0,0,0,0,res,turnedOn);
        return res;
       
    }
}