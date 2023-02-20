/*Input: [-10,-5,0,3,7]
Output: 3
Explanation:
For the given array, A[0] = -10, A[1] = -5, A[2] = 0, A[3] = 3, thus the output is 3. */

import java.util.*;
class fixedpoint{
    public static int fixed(int[] arr,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==mid){
                return mid;
            }int res=-1;
            if(mid+1<=arr[high]){
                res=fixed(arr, mid+1, high);
            }
            if(res!=-1){
                return res;
            }
            if(mid-1>=arr[low]){
                return fixed(arr, low, mid-1);
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(fixed(array, 0, n-1));
    }
}