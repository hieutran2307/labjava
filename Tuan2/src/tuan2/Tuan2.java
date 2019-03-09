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
public class Tuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int soDong, soCot;
    int sum = 0;
     
    Scanner scanner = new Scanner(System.in);
         
    System.out.print("Nhập vào số dòng của mảng: ");
    soDong = scanner.nextInt();
    System.out.print("Nhập vào số cột của mảng: ");
    soCot = scanner.nextInt();
         
    int[][] A = new int[soDong][soCot];
         
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            //System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
            //A[i][j] = scanner.nextInt();
            A[i][j] = (int) (Math.random()*50);
        }
    }
         
    System.out.println("Mảng vừa nhập: ");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print(A[i][j] + "\t");
        }
        // sau khi viết xong 1 dòng thi xuống hàng
        System.out.println("\n");   
    }
   
        System.out.print("Nhập k:");
         int k = scanner.nextInt();
        for (int i = 0; i < soDong; i++) {
            if(k==i+1)
            {
                sum = 0;

            //System.out.println("tổng phan tu tren so dong : " + k);
            for (int value : A[i]) {
                sum = sum + value;
            }
            System.out.println("\nTong phan tu la :" + sum);
            }  
            
        }
   
    }
}
