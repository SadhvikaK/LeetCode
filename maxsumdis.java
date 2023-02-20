/*Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions*/import java.util.*;
class maxsumdis{
        public static List<Integer> maximumSubarraySum(int[] nums, int k) {
            ArrayList<Integer> al=new ArrayList<Integer>();
            int n=nums.length;
            int sum=0;
            int i=0;
            int j=0;
            while(j<n-k){
                while(i<k){
                    sum+=nums[j];
                    i++;
                    j++;
                }
                al.add(sum);
                sum=0;
                i=0;
                j++;
            }
            return al;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int[] nums={1,5,4,2,9,9,9};
            int k=3;
            System.out.println(maximumSubarraySum(nums, k));
        }
}