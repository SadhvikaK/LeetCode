/*Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i */
import java.util.*;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr1[]=str.split("\\.",0);
        for(int i=arr1.length-1;i>=1;i--){
            System.out.print(arr1[i]+".");
        }
        System.out.print(arr1[0]);
    }
}