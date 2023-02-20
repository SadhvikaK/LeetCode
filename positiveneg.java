import java.util.*;
class positiveneg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> tot=new ArrayList<>();

        for(int i=0;i<num;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        if(pos.size()==neg.size()){
            for(int i=0;i<pos.size();i++){
                System.out.print(pos.get(i)+" "+neg.get(i)+" ");
            }
        }
        else if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                String s+=pos.get(i)+" "+neg.get(i)+" ";
            }
        }
    }
}
