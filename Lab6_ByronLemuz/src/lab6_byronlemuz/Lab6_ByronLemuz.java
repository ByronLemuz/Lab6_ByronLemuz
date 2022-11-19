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
            System.out.println(opcion);

            switch (opcion) {//Byron Lemuz

                case 1: {
                    char[][] matriz1 = new char[8][8];
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (i == 0 && j == 0) {
                                matriz1[i][j] = 'P';
                            } else {
                                matriz1[i][j] = '-';
                            }
                            

            
                
                        }
                    }
                    printMatriz( matriz1);
                }
                break;
        
                case 2: {

                }
                break;
                case 3: {
                    int filas = lea.nextInt();
                    System.out.print("Ingrese el numero de columnas:");
                    int columnas = lea.nextInt();
                    Random rand = new Random();
                    int minimo = 99;
                    int maximo = 122;
                    int[][] matrix = new int[filas][columnas];
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            matrix[i][j] = minimo + rand.nextInt((maximo - minimo) + 1);

                        }
                    }

                    System.out.println();
                    printMatrix(matrix, filas, columnas);
                    convertir(matrix, filas, columnas);
                

                }
                break;
                case 4: {
                    menu = false;
                }
                default:
                    System.out.println("La opcion que ingreso no es valida");

            }

        }}
    public static void printMatriz(char[][] matriz){
        
    
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[0].length; i++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
        
        }
    }
    public static void juego(char[][] matriz){
    for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[0].length; i++){
                if ((i==0&& j==2)||(i==0&&j==4)||(i==0&&j==7)||(i==1&&j==7)||(i==2&&j==0)||(i==2&&j==4)||(i==2&&j==6)||(i==3&&j==7)||(i==4&&j==0)||(i==4&&j==2)||(i==4&&j==6)||(i==5&&j==7)||(i==6&&j==0)||(i==6&&j==2)||(i==6&&j==4)||(i==7&&j==0)||(i==7&&j==7)){
                    
                
                
                    
                }
            }
           
            
        
        }
    }
    public static void printMatrix(int matriz[][], int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "-");
            }
            System.out.println();
        }
    }

    public static void convertir(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((char) matriz[i][j] + "-");
            }
            System.out.println();
        }
    
    }}

    
   

        
    

   



    
