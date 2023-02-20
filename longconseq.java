import java.util.*;
class longconseq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        int i=0;
        for(i=0;i<num-2;i++){
           if(arr[i]+1 != arr[i+1]){
            flag=arr[i];
           }
        }
        if(i+1==num-1 && arr[i]+1==arr[i+1]){
            flag=arr[i+1];
        }
        System.out.println(flag);
    }
}