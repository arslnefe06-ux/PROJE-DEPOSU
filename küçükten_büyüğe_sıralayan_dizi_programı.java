/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
import java.util.Scanner;
public class küçükten_büyüğe_sıralayan_dizi_programı {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n sayısı gir:");
        int n = input.nextInt();
        
        int dizi[] = new int[n];
    
        for(int i = 0; i<dizi.length; i++){
            System.out.println(i+"İndeksli eleman:");
            dizi[i] = input.nextInt();
        }
        int enküçük = input.nextInt();
        for(int i = 0; i<dizi.length; i++){
            if(dizi[i] < enküçük);
               enküçük = dizi[i];        
               dizi[i] = i;
        System.out.print(dizi[i]+" ");
        } 
    } 
}  
