import java.util.*;
class insertpos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        int target=sc.nextInt();
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<num;i++){
            if(target==arr[i]){
                temp=i;
                break;
            }
            if(target<arr[i] && target!=arr[i]){
                temp=i;
                break;
            }
            if(target>arr[num-1] && target!=arr[i]){
                temp=num;
                break;
            }
        }
        System.out.println(temp);
    }
}