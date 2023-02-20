/* Given a container with N+1 balls with a number printed on them.
Numbers are between 0 to N, there is no repetition of numbers.

A ball is missed from the container.
Your task is to findout the ball, and return the number printed on it.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, numbers[].

Output Format:
--------------
An integer, print the number on the missing ball.


Sample Input-1:
----------------
4
3 0 1 4

Sample Output-1:
------------------
2


Sample Input-2:
----------------
6
3 0 1 4 5 2

Sample Output-2:
------------------
6


*/
import java.util.*;
class d3p3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int num1=arr[0];
        int temp=0;
        for(int i=0;i<num;i++){
            if(num1==arr[i]){
                num1+=1;
            }
            temp=num1;
        }
        System.out.println(temp);
    }
}
