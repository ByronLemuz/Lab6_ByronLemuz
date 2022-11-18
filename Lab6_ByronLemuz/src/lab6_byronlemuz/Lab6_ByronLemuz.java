/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6_byronlemuz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Lab6_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner lea = new Scanner(System.in);
        boolean menu = true;

        while (menu == true) {//Byron Lemuz
            System.out.println("****Menu****");
            System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("3) Ejercicio 3");
            System.out.println("4) Salir");
            System.out.println("-------------------------");
            System.out.print("ingrese la opcion que desee: ");
            int opcion = lea.nextInt();

            switch (opcion) {//Byron Lemuz

                case 1: {
                    

                
                }
                break;
        
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {
                    menu = false;
                }
                default:
                    System.out.println("La opcion que ingreso no es valida");

            }

        }
    }
    
    public static void printMatriz(char[][] matriz){
        for(int j=0; i< matriz.length; i++){
            for(int j=0; i<matriz[0].length; i++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            System.out.println("Hello, World!");
        char [][] matriz = new char[8][8];
        for(int j = 0; i < 8; i++){
            for(int j = 0; i < 8; i++){
                if(i == 0 && j == 0)
                    matriz[i][j] = 'P';
                else
                    matriz[i][j] = '-';
       


        
    

   



    
