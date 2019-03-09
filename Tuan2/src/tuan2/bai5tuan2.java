/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class bai5tuan2 {
    
    public static void timXauMax(String strInput)
    {
        StringTokenizer strToken=new StringTokenizer(strInput,",\t,\r");
        int Max,i=1,lengthStr;
        Max=strToken.nextToken().length();
        int vitriMax=i;
        while(strToken.hasMoreTokens()){
            lengthStr=strToken.nextToken().length();
            i++;
            if(Max<lengthStr){
                Max=lengthStr;
                vitriMax=i;
            }
        }
        System.out.println("Do dai xau lon nhat la: "+Max+ "\nỞ vị trí: " +vitriMax);   
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap vao 1 xau: ");
        String strInput=input.nextLine();
        timXauMax(strInput);
    }
}
