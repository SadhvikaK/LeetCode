import java.util.*;
class missingele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int ele=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                ele=arr[i]+1;
                System.out.println(ele);
            }
            else{
               continue;
            }
          
        }
    }
}
