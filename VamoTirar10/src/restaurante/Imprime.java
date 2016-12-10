/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Davidson
 */
abstract class Imprime extends Facede{
    
       
 
  public void imprimeTickets(int ultimo, int quantidade) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i, n, qtd;
 
    n = ultimo+1;
    qtd = quantidade;
    FileWriter arq = new FileWriter("f:\\tickets.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    gravarArq.printf("+------------+%n");
    for (i=0; i<qtd; i++) {
        gravarArq.printf(" ------------ %n");
        gravarArq.printf("+------------+%n");
        gravarArq.printf("|%d ticket |%n", n);
        gravarArq.printf("+------------+%n"); 
        gravarArq.printf(" ------------ %n");
        
        n++;
    }
    gravarArq.printf("+-------------+%n");
 
    arq.close();
 
    System.out.printf("\nGravada com sucesso em \"f:\\tickets.txt\\n");
  }
}

