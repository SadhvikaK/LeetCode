import java.util.*;
class smallestcom{
    public static boolean bs(int[] arr,int l,int h,int target){
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{      
                h=mid-1;
            }
        }
        return false;
    }
    public static int smc(int a[][]){
        if(a.length==1){
            return a[0][0];
        }
        for(int i:a[0]){
            int count=0;
            for(int j=1;j<a.length;j++){
                if(bs(a[j],0,a.length-1,i)){
                    
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==a.length-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a[][]=new int[][]{{1,2,3,4,5},{2,4,5,8,10},{3,5,7,8,9},{1,2,5,7,8}};
        System.out.println(smc(a));
    }
}
