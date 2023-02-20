/*Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer. */

import java.util.*;
class longestpalin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res="";
        String val="";
        for(int i=0,j=str.length()-1;i<str.length()&& j>=0;i++,j--){
                if(j>i){
                    if(str.charAt(i)==str.charAt(j)){
                        System.out.print(str.substring(i, j+1));
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        //System.out.println(res);
    }