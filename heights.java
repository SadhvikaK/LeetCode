/*Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5. */

import java.util.*;
 class heights{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min=arr[0]+val;
        int max=arr[num-1]-val;
        
    }
}