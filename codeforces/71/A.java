/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class AWayTooLongWords {

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
int n=in.nextInt();
String[] s=new String[n];
     for(int i=0;i<n;i++)
     {
     s[i]=in.next();
     }
     for(int i=0;i<n;i++)
     {
     if(s[i].length()<=10)
     System.out.println(s[i]);
     else
       System.out.println(""+s[i].charAt(0)+""+(s[i].length()-2)+""+s[i].charAt(s[i].length()-1));
     }
    } 
        
    }
    

