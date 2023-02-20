import java.util.*;
class rotate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        String str="";
        for(int i=0;i<num;i++){
            str+=Integer.toString(arr[i]);
        }
        String str1=String.valueOf(str.charAt(num-1))+str.substring(0,num-1);
        for(int i=0;i<num;i++){
            System.out.print(str1.charAt(i)+" ");
        }
    }
}
