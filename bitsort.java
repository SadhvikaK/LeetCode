import java.util.*;
import java.util.Map.Entry;

class bitsort{
    static void BitwiseSorting(int [] arr){
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int s=Integer.bitCount(arr[i]);
            hm.put(arr[i],s);
        }
        Collection<Integer> values=hm.values();
        ArrayList <Integer> al=new ArrayList<>(values);
        Collections.sort(al);
        //System.out.println(al);
            int k=0;
            while(k<(al.size())){
            for (Entry<Integer, Integer> entry: hm.entrySet())
            {
                //System.out.print(al.get(k)+" ");
            if (entry.getValue()==al.get(k) && k<al.size()-1){
                System.out.print(entry.getKey()+" ");
                k++;
                //System.out.println(k);
            }
            else if(entry.getValue()==al.get(k)&& k==al.size()-1){
                System.out.print(entry.getKey()+" ");
            }
        }
        k++;
    }
}
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BitwiseSorting(arr);
    }
}