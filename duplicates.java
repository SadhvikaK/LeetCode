import java.util.*;
class duplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        String str="";
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]==arr[j] &&)
                str+=i;
            }
        }
        System.out.println(str);
    }
}
