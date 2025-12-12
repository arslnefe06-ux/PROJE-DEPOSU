/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
import java.util.Scanner;
public class n_tane_sayının_standart_sapma_varyantını_bulan_dizi_programı {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n sayısı gir:");
        int n = input.nextInt();
        int[] dizi = new int[n];
        
        for(int i = 0; i<dizi.length; i++){
            System.out.println(i+"İndeksli eleman:");
            dizi[i] = input.nextInt();
        }
        int toplam = 0;
        for(int i = 0; i<dizi.length; i++){
            toplam += dizi[i];
        } 
        double aritmetikort = (double) toplam/dizi.length;
        
         
        for(int i = 0; i<dizi.length; i++){
            dizi[i] = (int) (dizi[i] - aritmetikort);   
        }
        
        for(int i = 0; i<dizi.length; i++){
            dizi[i] = (int) Math.pow(dizi[i] - aritmetikort, 2);
        }
       
        int toplam2 = 0;        
        for(int i = 0; i<dizi.length; i++){
            toplam2 += dizi[i];
        }   
        double standartsapma = (double)Math.sqrt(toplam2 / dizi.length);  
        System.out.println("Standart sapma:"+standartsapma );  
    }
}
