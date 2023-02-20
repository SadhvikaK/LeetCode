/*Input: num1 = "2", num2 = "3"
Output: "6" */
import java.util.*;
class multiplystrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        char[] ch1=str.toCharArray();
        char[] ch2=str1.toCharArray();
        int j=0;
        String res="";
        int num=0;
        while(j<ch1.length){
            num=num*10+(ch1[j]-'0');
            j++;
        }
        int num1=0;
        int i=0;
        while(i<ch2.length){
            num1=num1*10+(ch2[i]-'0');
            i++;
        }
        int val=num*num1;
        res+=val;
        System.out.println(res);
    }
}