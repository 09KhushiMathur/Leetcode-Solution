class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int area = 0;
        while(left<= right){
            int w = right - left;
            int hight = Math.min(height[left],height[right]);
            int a = w*hight;
            if(a>area){
                area = a;
            }
            if(height[left]<height[right]){
                left++;
                continue;
            }else{
                right--;
            }
        
        }
    return area;
        
    }
}