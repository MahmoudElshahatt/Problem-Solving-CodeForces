

import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class AJuicer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); int w=0; int sum=0;
        int n=input.nextInt();        int b=input.nextInt();          int d=input.nextInt();
   int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=input.nextInt();
        if(a[i]<=b)
        sum+=a[i];
        else{
        continue;}
        if(sum>d){
            w++;
            sum=0;
        }
        }
        System.out.println(w);
        
        
        
    }
    
}
