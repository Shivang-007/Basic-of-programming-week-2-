
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=1;
        for(int i=1;i<n;i++){
            if(a[i]!=a[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
