/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19;

/**
 *
 * @author Lorenzo
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
    
    
    public static void main(String[] args) {
       
        int [][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int [][] matrizTrans = {{0,2,4},{-2,0,-2},{4,2,0}};
        boolean valida = true;
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTrans[i][j]);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(matriz[i][j]==-matrizTrans[i][j]))
                        {
                            valida = false;
                            break;
                        }
            }
                }

            if (valida) {
                
                System.out.println("\nEs antisimétrica");
                
            }
            else {
                System.out.println("\nNo es antisimétrica");
            }
            
            
        
    }
    
}
