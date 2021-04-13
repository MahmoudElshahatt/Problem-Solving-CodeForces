
import java.util.Scanner;

public class AIsItRated {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
         int n=in.nextInt();  boolean flag=false; int c=0;
        int[] list1=new int[n];  int[] list2=new int[n];
        for(int i=0;i<n;i++)
        {
        list1[i]=in.nextInt(); list2[i]=in.nextInt();
        if(list1[i]!=list2[i])
         c++;
        }
        if(c>0)
        System.out.println("rated");
        else
        {
            int d=list1[0];
        for(int i=1;i<n;i++)
        {
        if(list1[i]>d){
       flag=false;
       break;
        }else{
         flag=true;
        d=list1[i];
        }
        
        }
        if(flag)
            System.out.println("maybe"); 
        else System.out.println("unrated");
        
    }
    }
}