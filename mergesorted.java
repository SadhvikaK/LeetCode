import java.util.*;
class mergedsorted{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] arr=st.split(" ");
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);   
        }
        String m=sc.nextLine();
        String str=sc.nextLine();
        String[] ar=str.split(" ");
        int[] a=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            a[i]=Integer.parseInt(ar[i]);
        }
        String n=sc.nextLine();
        int i=0;
        for(int j=0;j<arr1.length;j++){
            if(arr1[j]==0 && j>Integer.valueOf(m)-1){
                arr1[j]+=a[i];
                i++;
            }
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
