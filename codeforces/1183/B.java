
import java.util.Arrays;
import java.util.Scanner;

public class BEqualizePrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
    int q=in.nextInt();  boolean flag=true; int b=0;
    for(int p=0;p<q;p++){
       int n=in.nextInt();      int k=in.nextInt();  
       int[] qu=new int[n];
       for(int i=0;i<n;i++){
       qu[i]=in.nextInt();
       }
       Arrays.sort(qu);
        b=qu[0]+k;
        for(int i=0;i<n;i++){
       if(Math.abs(qu[i]-b)<=k)
         flag=true;
       else {
               flag=false;
       break;
       }
        }
       if(flag)
       System.out.println(b);
       else
               System.out.println(-1);
       
       
       }
    }
     
      
    }
    
    
 
    

