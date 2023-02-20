/*Given a string S, in encrypted form, and also given an integer list of S.length.

You need find the decrypted form of String S, 
by moving each character at ith position in S, to indices[i] position in 
decrypted string and then print the decrypted string.

Input Format:
-------------
Line-1 -> A String S, enocded string of length L
Line-2 -> L space separated integers arr[], where 0 <=arr[i] < L 

Output Format:
--------------
Print a String, decoded string.


Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4

Sample Output-1:
----------------
memorial

Explanation:
---------------
Given String, aeilmmor
a e i l m m o r
6 1 5 7 2 0 3 4
after shifting,	memorial


Sample Input-2:
---------------
aidin
4 3 2 0 1

Sample Output-2:
----------------
india

Explanation-2:
---------------
Given String, aidin
a i d i n
4 3 2 0 1
after shifting,	india
*/
import java.util.*;
class d12p1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] arr=new int[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Character> hs=new HashMap<>(str.length());
        for(int i=0;i<str.length();i++){
            hs.put(arr[i],str.charAt(i));
        }
        String str1="";
        for(Map.Entry<Integer,Character> e:hs.entrySet()){
             str1+=String.valueOf(e.getValue());
        }
        System.out.println(str1);
    }
}