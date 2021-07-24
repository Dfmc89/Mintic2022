/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic2022;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author DFMC
 */
public class Reto1 {
    public static Scanner leer = new Scanner(System.in);
    public static int fila=5,columna=4;
    public static int [][]Notas = new int [fila][columna];   
    public static Map<Integer, String> asignatura= new TreeMap();
    
public static void main(String[] args){
    Diccionario();
    
    int opcion;  
    
    opcion = menu();
    
    switch(opcion){
        
        case 1:{
            CargarNotas();
            menu();
        }
        case 2:{
            Imprimir();
            menu();
        }
        case 3:{
            Consulta();
            menu();
        }
        case 4:{
            break;
        }
        default:{
            System.out.println("¡¡ Digite una opcion valida !!");
            menu();
        }
    }
}

public static int menu(){ 
    int op;
    System.out.println("==================================== \n                     Menu \n");
    System.out.println("==================================== \n 1.Cargar Calificacion \n 2.Imprimir boletin \n 3.imprimir Asignatura \n 4.Salir");

    System.out.println("Por favor seleccione una opcion:");
    op = leer.nextInt();
return op;
}

public static void Diccionario(){
    
    asignatura.put(0, "Matematicas");
    asignatura.put(1, "Ciencias");
    asignatura.put(2, "Ingles");
    asignatura.put(3, "Informatica");
    asignatura.put(4, "Deportes");   
      
    
}

public static int [][]CargarNotas(){
       int i,j,f;
    for(i=0;i < fila;i++){
        f=1;
          for(j=0;j < columna;j++){
              
              System.out.println("Por favor digite la nota ["+f+"] para la asignatura["+asignatura.get(i)+"]");
              Notas[i][j]= leer.nextInt();
             f= f + 1;
          }
    }
    
    return Notas;
}
public static void Imprimir(){
        
    int i,j,f;
    for(i=0;i < fila;i++){
        System.out.println("Asignatura:"+asignatura.get(i));
        f=1;
          for(j=0;j < columna;j++){              
              System.out.println("Nota periodo["+f+"]:"+Notas[i][j]);
              f= f + 1;
          }
    }
}

public static void Consulta(){
    int n1;
    System.out.println("Por favor digite la asignatura que desea consultar ");
    System.out.println("0.Matematicas \n 1.Ciencias \n 2.Ingles \n 3.Informatica \n 4.Deportes  ");
    n1 = leer.nextInt();
    int i,j,f;
    if (n1 <= 4){ 
        for(i=0;i < 1;i++){
            System.out.println("Asignatura:"+asignatura.get(n1));
            f=1;
            for(j=0;j < columna;j++){              
                System.out.println("Nota periodo["+f+"]:"+Notas[n1][j]);
                f= f + 1;
            }
        }
    }
    else{
    System.out.println("Por favor digite una opcion valida");
        Consulta();
    }
}
}


