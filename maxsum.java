import java.util.*;
class maxsum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=arr[i];
            al.add(sum);
        }
        int max=al.get(0);
        for(int i=1;i<num;i++){
            if(max<al.get(i)){
                max=al.get(i);
            }
        }
        System.out.println(max);
    }
}
