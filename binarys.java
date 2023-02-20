import java.util.*;
class binarys{
    public static int binarysearch(int[] arr,int tar){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[mid]<tar){
                low=mid+1;
            }
            else{
                high=low-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,5,6};
        int tar=5;
        int res=binarysearch(arr, tar);
        if(res==-1){
            System.out.println("not present");
        }
        else{
            System.out.println(res);
        }
    }
}