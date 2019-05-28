/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Elena
 */
public class JavaApplication24 {
    
    
    public static void main(String[] args) {
        int suma;
        
        
        Scanner reader=new Scanner(System.in);
         System.out.println("Ingrese un numero: ");
        int a=reader.nextInt();
         System.out.println("Ingrese un numero: ");
        int b=reader.nextInt();
        
        suma=a+b;
        System.out.println("Suma: "+suma);
        

    }
    
}
