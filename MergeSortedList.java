//Time Complexity - O(m + n)
//Space Complexity - O(1)
//Approach - find the max of the number in nums1 and nums2, whichever is the higher number put that at the end of the array and decrement accordingly. 
//If p1 has reached less than 0, but p2 still is >=0 (there are still elements in nums2 which have not been placed in nums1), then we can straight away copy those to nums1. 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(nums1 == null || nums1.length == 0){
        //     return;
        // }
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while(p1 >= 0 && p2 >= 0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            p3--;
            if(nums1[p1] > nums2[p2]){
                p1--;
            }
            else{
                p2--;
            }
        }
        //no need to check for p1, when p2 goes out of bounds, p1 is already sorted and in ascending 
        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
          
    }
}