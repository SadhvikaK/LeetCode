import java.util.*;
class firstrepeating{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]==arr[j]){
                    hs.put(i,arr[i]);
                }
                else{
                    System.out.println(-1);
                    break;
                }
            }
        }
        if(hs.isEmpty()){
        for(int key: hs.keySet()){
            System.out.println(key);
            break;
        }
    }}
}
