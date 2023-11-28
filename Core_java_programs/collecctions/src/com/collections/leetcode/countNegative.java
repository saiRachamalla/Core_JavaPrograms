package com.collections.leetcode;
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int low=0;
            int high=grid[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(grid[i][mid]<0){
                     count+=(high-mid+1);
                      high=mid-1;
                    
                }
                else {
                    low=mid+1;
                }
                
            }
            System.out.println("count inner"+count);
          
        }
          return count;
    }
}
public class countNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		Solution s=new Solution();
		System.out.println(s.countNegatives(grid));

	}

}
