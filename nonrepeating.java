import java.util.*;
class nonrepeating{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]!=arr[j]){
                    flag=arr[i];
                    break;
                }
                else{
                    flag=0;
                }
            }
        }
        System.out.println(flag);
    }
}
