import java.util.*;
class chotabheem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        
        if(arr[0]!=start){
            int var3=arr[0]-1;
            if(start==var3){
                System.out.print(start+" ");
            }
            else{
                System.out.print(start+":"+var3+" ");
            }
        }
        /*else if(arr[num-1]!=end && start==1){
            al.add(num+1);
            al.add(end);
        }*/
        for(int i=0;i<num-1;i++){
            if(arr[i]+1!=arr[i+1]){
                int var=arr[i]+1;
                int var1=0;
                if(arr[i+1]-1!=arr[i]){
                    var1=arr[i+1]-1;
                }
                if(var!=var1){
                    System.out.print(var+":"+var1+" ");
                    //al.add(var1);
                }
                else{
                    System.out.print(var+" ");
                }
            }
        }
        if(arr[num-1]!=end){
            int var4=arr[num-1]+1;
            //al.add(arr[num-1]+1);
            if(end==var4){
                System.out.print(end+" ");
            }
            else{
            System.out.print(arr[num-1]+1+":"+end+" ");
            }
        }
    }
}