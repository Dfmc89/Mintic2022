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
public class Mintic2022 {

       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner leer = new Scanner(System.in);    
    int n1, n2, resultado;
    System.out.println("Por favor Digite el numero 1");
    n1 = Integer.parseInt(leer.nextLine());
    System.out.println("Por favor digite el nuemro 2");
    n2 = Integer.parseInt(leer.nextLine());
    
    if(n1<n2){
        System.out.println(n1+" es menor a "+n2);
    }
    else if(n1>n2){
        System.out.println(n1+" es mayor a "+n2);
    }
    else{
        System.out.println(n1+" es igual a "+n2);
    }
   
    

  // TODO code application logic here
    }
    
}
