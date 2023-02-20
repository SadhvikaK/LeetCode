/*Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42. */
import java.util.*;
class atoi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.trim();
        char[] arr=str1.toCharArray();
        int index=0;
        String st="";
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[0]) || arr[0]=='+' || arr[0]=='-'){
            if(Character.isDigit(arr[i])){
                st+=arr[i];
            }
            else if(arr[i]=='+'){
                st=arr[i]+st;
            }
            else if(arr[i]=='-'){
                st=arr[i]+st;
            }
            else if(arr[i]=='.'){
                break;
            }
        }
        else{
            st="0";
        }
    }
    long num=Long.parseLong(st);
    if(num<Integer.MIN_VALUE){
        System.out.print(Integer.MIN_VALUE);
    }
    else if(num>Integer.MAX_VALUE){
        System.out.print(Integer.MAX_VALUE);
    }else{
        System.out.println(num);
    }
    }
}
