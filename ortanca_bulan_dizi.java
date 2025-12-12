/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
import java.util.Scanner;
public class ortanca_bulan_dizi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);                
        System.out.println("Dizi boyutunu gir:");
        int n = input.nextInt();
        int[] tamsayı = new int[n]; 
        
        for(int i = 0; i <= tamsayı.length-1; i++){
            System.out.print(i+"İndeksli eleman: " );
            tamsayı[i] = input.nextInt();
            }
       int ortadaki = tamsayı.length/2;
     System.out.println("Ortadaki eleman:"+ortadaki);
    } 
}
