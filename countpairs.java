import java.util.*;
class countpairs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]+arr[j]==target){
                    count+=1;
                }
            }
        }
        System.out.print(count);
    }
}
