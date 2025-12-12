/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
import java.util.Scanner;
public class n_elemanlı_dizinin_aritmetik_geometrik_ve_harmonik_ortalamasını_bulan_program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n sayısı gir:");
        int n = input.nextInt();
        int dizi[] = new int[n];
        
        for(int i = 0; i<dizi.length; i++){
            System.out.println(i+"İndeksli eleman:");
            dizi[i] = i; 
        }
        int toplam = 0;
        for(int i = 0; i<dizi.length; i++){
            toplam += dizi[i];   
        }         
      double aritmetikort = (double) toplam/dizi.length;    
      System.out.println("Aritmetik ortalama:"+aritmetikort); 
      
      int çarpım = 1;
      for(int i = 1; i<dizi.length; i++){
            çarpım *= dizi[i];
      }
     double geometrikort = Math.pow(çarpım, 1.0/dizi.length);       
        System.out.println("Geometrik ortalama:"+geometrikort);
        
        int terstoplam = 0;
        for(int i = 0; i<dizi.length; i++){
            terstoplam += 1/dizi[i]; 
    }  
    double harmonikort = (double) dizi.length/terstoplam; 
    System.out.println("Harmonik ortalama:"+harmonikort);
    }
}
