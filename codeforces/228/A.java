

import java.util.Arrays;
import java.util.Scanner;

public class AIsYourHorseshoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0,b=0;  int[] s=new int[4] ; 
        for(int i=0;i<4;i++)
        {
         s[i]=input.nextInt();
        }
        Arrays.sort(s);
        for(int i=0;i<4;i++)
 { if(s[i]!=b) b=s[i];
 else{num++;} 
        }
        System.out.println(num);
    }
    
}
