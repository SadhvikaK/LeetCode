import java.util.*;
class removeele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<num;j++){
            if(num1!=arr[j]){
                arr[count]=arr[j];
                count+=1;
            }
        }
        System.out.println(count);
    }
}
