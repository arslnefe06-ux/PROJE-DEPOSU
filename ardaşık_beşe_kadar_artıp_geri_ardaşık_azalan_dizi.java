/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to  edit this template
 */

/**
 *
 * @author Efe
 */
import java.util.Scanner;
public class ardaşık_beşe_kadar_artıp_geri_ardaşık_azalan_dizi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int dizi [] = new int [12];
    
        for(int i = 0; i<12; i++){
            if(i<6){
                dizi[i] = i;
            }
            else{
                dizi[i] = 11 - i;
            } 
           System.out.print(dizi[i]+" "); 
        }       
    }
}
