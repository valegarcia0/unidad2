/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica
        
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Scanner calcula =new Scanner (System.in);
      System.out.println("Ingresa cantidad ");
      Double moneda =calcula.nextDouble();
      Double div1,div2,div3,div4;
      div1 = moneda/18.21;
      div2 = moneda/17.07;
      div3 =moneda/0.12;
      div4 =moneda/21.18;
      
        System.out.println("El valor en euros es "+div1);
        System.out.println("El valor en dolares es "+div2);
        System.out.println("El valor en yenes es "+div3);
        System.out.println("El valor en libras es "+div4);
    
    }
 
    }
    

