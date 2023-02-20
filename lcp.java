/*Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings */
import java.util.*;
class lcp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] arr=new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.next();
        }
        int min=arr[0].length();
        String res="";
        for(int i=1;i<num;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
                res=arr[i];
            }
            else if(arr[i].length()==min){
                min=arr[i].length();
                res=arr[i];
            }
        }
        String temp1="";
        for(int i=0;i<min;i++){
            temp1+=String.valueOf(arr[0].charAt(i));
            for(int j=0;j<arr.length;j++){
                if(arr[j].startsWith(temp1)){
                    continue;  
                }
                else{
                    temp1=temp1.substring(0,temp1.length()-1);
                    if(temp1.length()==0){
                        temp1="-1";
                    }
                }
            }
        }
        System.out.println(temp1);
    }
}