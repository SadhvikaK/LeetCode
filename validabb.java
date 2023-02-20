/*The Valid shortcuts of a string "abcd", are as follows:
abcd, abcd, a1cd, ab1d, abc1, 2cd, a2d, ab2, 1b1d, 1bc1,a1c1, 1b2, 2c1, 3d, a3, 4

You are given a string S and shortcut string  SC, 
Your task is to find out whether the string matches with the given shortcut or not.
if matched print true, else false.

Note:
String S contains only lowercase letters and String SC contains only 
lowercase letters and digits.

Input Format:
-------------
Two space separated Strings S and SC

Output Format:
--------------
Print a boolean value


Sample Input-1:
---------------
internationalization i12iz4n

Sample Output-1:
----------------
true


Sample Input-2:
---------------
apple a2e

Sample Output-2:
----------------
false
 */
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String tar=sc.next();
        int res=0;
        char[] arr=tar.toCharArray();
        StringBuilder sb=new StringBuilder();
        int j=0;
        while(j<arr.length){
            if(Character.isDigit(arr[j])){
                int num=0;
                while(Character.isDigit(arr[j])){
                    num=num*10+(arr[j]-'0');
                    j++;    
                }
                res+=Integer.valueOf(num);
            }
            else{
                sb.append(arr[j]);
                j++;
            }
    }
    int num1=sb.length();
    if(num1+res==str.length()){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}
