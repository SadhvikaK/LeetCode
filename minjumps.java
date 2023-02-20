/*Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Explanation: 
First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to the last.  */

import java.util.*;
class minjumps{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int jumps=1;
        int max=arr[0];
        int start=arr[0];
        if(arr.length<2){
            System.out.println(0);
        }
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,i+arr[i]);
            if(i==start){
                jumps++;
                start=max;
            }
        }
        if(start<num-1){
            System.out.println(start);
        }
        System.out.println(jumps);
        
    }
}