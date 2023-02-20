import java.util.*;
class twosum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(target==arr[i]+arr[j]){
                    System.out.print("["+i+","+j+"]");
                }
            }
        }
    }
}
