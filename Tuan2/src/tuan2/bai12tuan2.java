/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class bai12tuan2 {
    
 public static void RandomInt2File(String filename, int numrand) throws Exception {
        PrintWriter wt = new PrintWriter(new FileWriter(filename),true);
        int count = 0;
        while(count<numrand){
            int a = (int)Math.ceil(Math.random()*(100-10+1))+10;
            wt.print(a+" ");
            count++;
            if(count%10==0) wt.println();
        }
        wt.close();
    }
    public static void XuatRandomFile(String filename) throws Exception{
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(filename));
            while (true) {
                StringTokenizer tok = new StringTokenizer(br.readLine()," ");
                int count = 0;
                while(tok.hasMoreTokens()){
                    int a = Integer.parseInt(tok.nextToken());
                    System.out.print(a+" ");
                    count++;
                    if(count%10==0) System.out.println();
                }
            }
        }
        catch(EOFException ee){
            br.close();
        }
        catch(Exception ee){

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        RandomInt2File("C:\\rand.txt",134);
        XuatRandomFile("C:\\rand.txt");

    }
    
}
