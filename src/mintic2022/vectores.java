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
public class vectores {
    public static void main(String[] args){
      Scanner leer = new Scanner(System.in);
      int longitud = 2, i, j, fila=3,columna=3;
      float  promedio=0, promedio2=0;
      float[] vector = new float[longitud];
      float[][] vectorBid = new float[fila][columna];
      
      for(i=0;i < longitud;i++){
          for(j=0;j < longitud;j++){
              System.out.println("Por favor digite el numero para guardarlo en la posicion:["+i+"]["+j+"]");
              vectorBid[i][j]= leer.nextFloat();
          }
      }
      for(i=0;i < longitud;i++){
          for(j=0;j < longitud;j++){
              System.out.println("Vector:["+i+"]["+j+"]"+vectorBid[i][j]);              
          }
      }
      for(i=0;i<longitud;i++){
          promedio=0;
          for(j=0;j<longitud;j++){
              promedio = promedio + vectorBid[i][j];              
          }
          promedio2=promedio/2;
          vector[i]= promedio2;
          System.out.println("Promedios: "+vector[i]);
          
      }      
    
    }
}
