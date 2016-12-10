/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Davidson
 */
public class Teste_Funcao {
        float ticket=0;
        float pago=0;
        float troco=0;
        float falta=0;
        
    
    public float calculaTroco(int qtdTicket, float valorTicket, float valorPago){
        int qtd=qtdTicket;
        this.ticket = valorTicket;
        this.pago = valorPago;
        float total=qtd*valorTicket;
        if(total>valorPago){
            System.out.println("\nDescupe, esta faltando dinheiro\n");//caixa de resposta
            return 0;
        }else{
            float aux = pago-total;
            System.out.println("\nSeu troco é:"+ aux);
            return aux;        
        }
    }
    


        

    /*    valordevido = copia.close();
        System.out.print( "Digite o valor total pago" );
	valorpago = input.nextInt();

  public  void  verifica() { 
	 


	if(valorpago<valordevido)

		falta=valordevido-valorpago;
		
			System.out.println( "Faltam R$:" + falta);

				if else (valorpago>valordevido)

						troco=valorpago-valordevido;
		
   							 System.out.println( "Troco Total:" + troco);


						else 
							System.out.println( "Não Sobrou Troco!!!" );

}*/
}
