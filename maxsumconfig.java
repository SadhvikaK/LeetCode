/*N = 4
A[] = {8,3,1,2}
Output: 29
Explanation: Above the configuration
possible by rotating elements are
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
Here the max sum is 29  */
import java.util.*;
class maxsumconfig{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        int[] arr2=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        String[] arr1=new String[num];
        String str="";
        for(int i=0;i<num;i++){
            str+=Integer.toString(arr[i]);
        }
        String str2=str;
        for(int i=0;i<num;i++){
            arr1[i]=str2.substring(1)+str2.charAt(0);
            str2=arr1[i];
        }
        int sum=0;
        for(int i=0;i<num;i++){
            String str1=arr1[i];
            for(int j=0;j<str1.length();j++){
                sum+=(str1.charAt(j)-'0')*j;
            }
            arr2[i]=sum;
            sum=0;
        }
        System.out.println(Arrays.toString(arr2));
    }
}