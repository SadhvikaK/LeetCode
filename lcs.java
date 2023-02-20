/*Vihaan is given a pair of words likely word1 and word2, he is asked to create 
a method which returns the numbers of characters in a word formed from long 
lasting frequent posteriority. 

Posteriority is a latest word formed from the native word with few characters 
removed without modifying the corresponding order of the left over characters. 

A frequent posteriority of two words is a posteriority that is frequent 
to both words. Return 0 if no common posteriority.

Input Format:
-------------
Two space separated strings S1, S2.

Output Format:
--------------
Print an integer, the length of longest common subsequence.


Sample Input-1:
---------------
abcde ace

Sample Output-1:
----------------
3


Sample Input-2:
---------------
acd bef

Sample Output-2:
----------------
0
*/
import java.util.*;
class lcs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        int len=Math.min(str.length(),str1.length());
        String str2="";
        String str3="";
        int count=0;
        if(str.length()>str1.length()){
            str2=str1;
        }
        else{
            str3=str;
        }
        for(int i=0;i<len;i++){
            ;
            str3.indexOf(ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
