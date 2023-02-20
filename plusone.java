import java.util.*;
class plusone{
    /*public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str="";
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            String s=Integer.toString(arr[i]);
            str+=s;
        }
        long s=Long.parseLong(str);
        s+=1;
        String l=Long.toString(s);
        int len=l.substring(0).length();
        int[] arr1=new int[len];
        for(int i=0;i<len;i++){
            arr1[i]=l.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(arr1));
    }*/
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=num-1;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
            }
            else{
                arr[i]+=1;
                break;
            }
        int[] arr1=new int[num+1];
        arr1[0]=1;
        System.out.println(Arrays.toString(arr1));
    }
}
}
