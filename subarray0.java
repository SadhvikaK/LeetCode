import java.util.*;
class subarray0{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        al.add(sum);
        for(int i=0;i<num;i++){
            sum+=arr[i];
            if(al.contains(sum)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
                al.add(sum);
            }
        }
        System.out.print(al);
    }
}