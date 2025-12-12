/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
import java.util.Scanner;
public class ikivektörünskalerçarpımı{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("X değerlerini gir:");
        int X = input.nextInt();
        int[] apsis = new int[X];
         
        for(int i = 0; i<apsis.length; i++){
            System.out.println(i+". X:");
            apsis[i] = input.nextInt();
        }
        System.out.println("Y değerlerini gir:");
        int Y = input.nextInt();
        int[] ordinat = new int[Y];
    
        for(int i = 0; i<ordinat.length; i++){
            System.out.println(i+". Y:");
            ordinat[i] = input.nextInt();
        }   
        int çarpım1 = 1;
        for(int i = 0; i<apsis.length; i++){
            çarpım1 *= apsis[i];
        }       
        int çarpım2 = 1;
        for(int i = 0; i<ordinat.length; i++){
            çarpım2 *= ordinat[i];
        }
        int skalerçarpım = (int) çarpım1 + çarpım2;     
        System.out.println("Skaler çarpım:"+skalerçarpım);
    }
}
