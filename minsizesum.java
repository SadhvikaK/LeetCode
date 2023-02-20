import java.util.*;
class minsizesum{
    public static int minSubArrayLen(int target, int[] nums){
        Arrays.sort(nums);
        ArrayList<Integer> al=new ArrayList<>();
        int l=0;
        int h=nums.length-1;
        while(l<h){
        int high=nums.length-1;
        int low=nums.length-2;
        int res=nums[high]+nums[low];
        al.add(high);
        al.add(low);
        while(res!=target){
            while(res<target && al.size()<nums.length){
                low--;
                al.add(low);
                res=res+nums[low];
                
            }
            while(res>target && al.size()<nums.length){
                res-=nums[high];
                al.remove(Integer.valueOf(high));
                high--;
            }
            if(res!=target){
                return 0;
            }
        }
        if(res==target){
            return al.size();
        }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,1,1,1,1,1};
        int target=11;
        System.out.println(minSubArrayLen(target,arr));
    }
}