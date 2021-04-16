

import java.util.Scanner;



/**
 *
 * @author elsawah
 */
public class ANextRound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in); 
int n=in.nextInt();  int k=in.nextInt(); int cnt=0;
int[] a=new int[n];
for(int i=0;i<n;i++)
{
    a[i]=in.nextInt(); 
}
for(int i=0;i<n;i++){
 if(a[i]>=a[k-1]&&a[i]>0)
        cnt++;
}
 System.out.println(cnt);
 
 
 
    }
    
}
