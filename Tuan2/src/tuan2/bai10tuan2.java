/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai10tuan2 {
    public static void main(String[] args) throws FileNotFoundException{  
        String fileName = "";
        File f = new File("");
        fileName = f.getAbsolutePath()+"\\src\\tuan2\\data.txt";
        f = new File(fileName);
        
        if (f.exists())
        {
            System.out.println("File đã tồn tại");
            System.exit(0);
        }
        
        PrintWriter pw = new PrintWriter(f);
        pw.print("Coppyright by Tuan 02 ");
        pw.println(2019);
        pw.print("https://google.com");
        System.out.println("Da ghi file xong");
        
        Scanner inp = new Scanner(f);
        while (inp.hasNext())
        {
            String ten = inp.next();
            System.out.print(ten+ " ");
            int maso = inp.nextInt();
            System.out.println(maso);
        }
    }
}
