import java.util.*;
class maxpro{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int mul=1;
        for(int i=0;i<num;i++){
            mul*=arr[i];
            al.add(mul);
        }
        int max=arr[0];
        for(int i=1;i<num;i++){
            if(max<al.get(i)){
                max=al.get(i);
            }
        }
        System.out.println(max);
    }
}
