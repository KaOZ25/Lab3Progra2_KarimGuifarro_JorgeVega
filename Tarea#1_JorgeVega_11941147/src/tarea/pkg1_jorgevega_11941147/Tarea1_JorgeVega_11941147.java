/*
Jorge Vega Tarea#1
 */
package tarea.pkg1_jorgevega_11941147;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import javafx.print.Collation;
import javax.swing.JOptionPane;

/**
Jorge Vega
 */
public class Tarea1_JorgeVega_11941147 {
      static Scanner leer = new Scanner (System.in);
    static Random R = new Random ();
    public static void main(String[] args) {
     Scanner leer =new Scanner (System.in);
        Random Ale= new Random();
        //ArrayList 

      //Declaracion
      ArrayList<Integer> Conjunto1=new ArrayList();
      ArrayList<Integer> Conjunto2=new ArrayList();
      ArrayList<Integer> Conjunto3=new ArrayList();

      int N = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de nodulos por conjunto"));
      for (int i = 0; i < N; i++) {
     Conjunto1.add(Ale.nextInt(300));
     Conjunto2.add(Ale.nextInt(300));
       }
        
        int op = 1;
        while(op != 6){
            op = 6;
            op = Integer.parseInt(JOptionPane.showInputDialog(null, 
                       " 1.Agregar un numero entero al primer conjunto\n"
                     + " 2.Agregar un numero entero al segundo  conjunto\n"
                     + " 3.Imprimir la intersección de ambos conjuntos\n"
                     + " 4. Imprimir la unión de ambos conjuntos\n"
                     + " 5. Imprimir los números impares de ambos conjuntos ordenados ascendentemenete\n"
                     + " 6.Salir\n\n"
                     + "INGRESE LA OPCION:"));

            switch (op){
                case 1:
                    
                    
                    
                    
                    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero que desea agregar"));
                      System.out.println("Primer Conjunto Original");
                      System.out.println(Conjunto1);
                      Conjunto1.add(a);
                      System.out.println("Conjunto con Numero Agregado");
                      System.out.println(Conjunto1);
                    break;
                    
                    
                    
                        
                case 2:
                    
                    
                    
                    
                    
                      int a2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero que desea agregar"));
                      System.out.println("Segundo Conjunto Original");
                      System.out.println(Conjunto2);
                      Conjunto2.add(a2);
                      System.out.println("Conjunto con Numero Agregado");
                      System.out.println(Conjunto2);
                    break;
                    
                    
                    
                    
                case 3:
                    
                    
                    
                    
                      System.out.println("Primer Conjunto Original");
                      System.out.println(Conjunto1);
                      System.out.println("Segundo Conjunto Original");
                      System.out.println(Conjunto2);
                      System.out.println("Intercepcion de los conjuntos");
                      for (int i = 0; i < Conjunto1.size(); i++) {
                          if (Conjunto2.contains(Conjunto1.get(i))) {
                            System.out.println(Conjunto1.get(i));
                           }}
                    break;
                    
                    
                    
                    
                case 4:  
                    
                    
                    
                    
                    
                     System.out.println("Primer Conjunto Original");
                      System.out.println(Conjunto1);
                      System.out.println("Segundo Conjunto Original");
                      System.out.println(Conjunto2);
                      System.out.println("Union de los conjuntos");
                      for (int i = 0; i < Conjunto1.size(); i++) {
                          if (Conjunto2.contains(Conjunto1.get(i))) {
                           } else{
                               Conjunto2.add(Conjunto1.get(i));}}
                      System.out.println(Conjunto2);
                    break;
                    
                    
                    
                    
                    
                case 5:
                    
                    
                    
                    
                    
                      System.out.println("Primer Conjunto Original");
                      System.out.println(Conjunto1);
                      System.out.println("Segundo Conjunto Original");
                      System.out.println(Conjunto2);
                      System.out.println("Numeros impares de ambos");
                      for (int i = 0; i < Conjunto1.size(); i++) {
                          if (Conjunto2.contains(Conjunto1.get(i))) {
                            } else{
                               Conjunto2.add(Conjunto1.get(i));}}
                      for (int i = 0; i < Conjunto2.size(); i++) {
                       int ene;
                       int fin;
                       ene = Conjunto2.get(i);
                       fin=ene%10;
                       if (fin%2==0){
                           if (ene==0){
                            }else{} 
                        }if (fin%2!=0){
                        Conjunto3.add(Conjunto2.get(i));
                        } } 
                         System.out.println(Conjunto3);
                    break;
                
                    
                    
                    
                    
                default:
                    JOptionPane.showMessageDialog(null, "LA OPCION NO ES VALIDA");
                case 6:
            }}
        
    }}
