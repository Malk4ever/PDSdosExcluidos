/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.util.Scanner;

/**
 *
 * @author Davidson
 */
public class Main {
    
    public static void main(String args[]) {
        
        Scanner copia=new Scanner(System.in);
        float valor, pago, troco;
        int quant;
        
        System.out.print("\nquant\n");
        quant=copia.nextInt();
        
        System.out.print("\nvalor\n");
        valor=copia.nextFloat();
        
        System.out.print("\npago\n");
        pago=copia.nextFloat();
        
        Teste_Funcao funcao=new Teste_Funcao(); 
        troco = funcao.calculaTroco(quant, valor, pago);    
        
        
    }
    
}
