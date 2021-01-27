

import java.util.Arrays;
import java.util.Scanner;

public class AOathOfTheNightSWatch {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
        int n=in.nextInt();  
        int nos=0;
        int[] s=new int[n];
        for(int i=0;i<n;i++)
        {
       s[i]=in.nextInt();
        }
        Arrays.sort(s);
        
   
       for(int i=0;i<n;i++){
          if(s[i]>s[0]&&s[i]<s[n-1])
          nos++;
          }
            System.out.println(nos);
    }
}
