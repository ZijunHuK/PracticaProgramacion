
package com.tiernoparla.practicaprogramacion;

    import java.util.*;

public class HuZijunPractica1 {
    public static void main(String[] args) {
   
    //introducir mensaje
    Scanner sca = new Scanner(System.in);
 
    System.out.println("Introduce longitud de tu mensaje: ");
   
    int longitud = sca.nextInt();
 
    System.out.println("longitud que tengo son: " + longitud);
    
    //Calcular cantidad mínima de bits de redundancia necesarios
    Random ram = new Random();
   
    for (int i = 0; i < longitud; i++) {
      int elevado = (int) Math.pow(2, i)-(i + 1);
      int total = (longitud + i) + 1;
 
      if (elevado >= longitud) {
          System.out.println("bits de redundancia de " + longitud + " es " + i + " y más bit global 1");
          System.out.println("bits en total son :" + total);
 
    //Genarar mensaje a binario aleatoriamente
          for (int k = 0; k < total; k++) {
          int binario = ram.nextInt(2);
          System.out.print(binario + " ");
            } //for k
 
            break;
        } //if
 
      } //for i
    
    } //main
} //HuZijunPractica1
