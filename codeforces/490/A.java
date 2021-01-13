/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class ATeamOlympiad {

    public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int [] m=new int[n];
ArrayList <Integer> giftedpr=new ArrayList <>();
ArrayList <Integer> giftedmath=new ArrayList <>();
ArrayList <Integer> giftedpe=new ArrayList <>();
  for(int i=0;i<n;i++) {
     m[i]=in.nextInt(); 
          if(m[i]==1)  giftedpr.add(i+1);
         else if(m[i]==2)  giftedmath.add(i+1);
        else giftedpe.add(i+1);
            }
  int test=Math.min(giftedpr.size(),giftedmath.size());
  int nteams=Math.min(test,giftedpe.size());
  System.out.println(nteams);
  for(int i=0;i<nteams;i++)
  {
   System.out.println(giftedpr.get(i)+" "+giftedmath.get(i)+" "+giftedpe.get(i)) ;
  }
    }
    
}
