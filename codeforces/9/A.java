/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class ADieRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        String[] roll={"1/6","1/3","1/2","2/3","5/6","1/1"};
        int m;
int x=input.nextInt(); int y=input.nextInt();
     m=Math.max(x, y);
                  System.out.println(roll[6-m]); 

 
        
    }
    
}
