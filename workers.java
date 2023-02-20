import java.util.*;
class workers {
    public static long  totalCost(int[] costs, int k, int candidates) {
        long sum=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<costs.length;i++){
            al.add(costs[i]);
        }
        Collections.sort(al);   
        System.out.println(al);
        int i=0;
        while(i<k){
            System.out.println(al.get(0));
            sum+=al.get(0);
            al.remove(al.get(0));
            System.out.println(al);
            i++;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,1};
        int k=3;
        int can=3;
        System.out.println(totalCost(arr, k, can));
    }
}