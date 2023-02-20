import java.util.*;
class removeduplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int count=1;
            for(int j=1;j<num;j++){
                if(arr[i]!=arr[j]){
                    arr[count]=arr[j];
                    count++;
                }
                i++;
            }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
