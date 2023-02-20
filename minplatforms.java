/*Input: n = 6 
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation: 
Minimum 3 platforms are required to 
safely arrive and depart all trains. */
import java.util.*;
class minplatforms{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int[] dep=new int[num];
        for(int i=0;i<num;i++){
            dep[i]=sc.nextInt();
        }
        int count=1;
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=1;i<num;i++){
            arr1.add(arr[i]);
        }
        ArrayList<Integer> dep2=new ArrayList<>();
        for(int i=0;i<num-1;i++){
            dep2.add(dep[i]);
        }
        for(int i=0;i<=arr1.size();i++){
            if(dep2.get(i)<arr1.get(i)){
                continue;
            }
            else if(dep2.get(i)>arr1.get(i) && dep2.get(i-1)<arr1.get(i)){
                
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}