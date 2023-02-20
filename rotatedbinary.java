/*Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4*/
import java.util.*;
class rotatedbinary{
    public static int rotate(int[] arr,int tar){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[0]<=arr[mid]){
                if(tar>=arr[0] && tar<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(tar<=arr[arr.length-1] && tar>=arr[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int res=rotate(arr, tar);
        System.out.println(res);
    }
}