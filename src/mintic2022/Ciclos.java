/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic2022;
import java.util.Scanner;
/**
 *
 * @author DFMC
 */
public class Ciclos {
    
 public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
 int n1=0, opcion=0,result=0;
 System.out.println("Por favor digite un entero:");
 n1 = Integer.parseInt(leer.nextLine());
 System.out.println("Por favor seleccione una operacion: \n 1.Factorial 2.Suma");
 opcion = Integer.parseInt(leer.nextLine());
 
  switch (opcion) {
            case 1: {
                 
                 result = fact(n1);
                 System.out.println("El factorial de:"+n1+" es:" +result);
                 break;
                
                
            }
            case 2: {
                result = sum(n1);
                System.out.println("La Sumatoria de " +n1+ " es igual a: " +result);    
                break;
            }
            default: {
                System.out.println("Opción no válida!!");

            }
        }
  
     
 }
 public static int fact(int num){
     int factoria=1, i=1;
     if (num >= 0) {
                    
        do {
            factoria = factoria * i;
            i++;
            } while (i <= num);           
    
    } 
    else {
        System.out.println("No existe Factorial para Números Negativos");
    }
     return factoria;
    
 }
    public static int sum(int num){
     int rest=0;
     for(int i=1; i<=num; i++){
                    rest = rest + ((2*i)-1);
                }
     return rest;
 }
 
 } 
 
    

