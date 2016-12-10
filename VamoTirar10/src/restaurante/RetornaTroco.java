/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.swing.JOptionPane;

/**
 *
 * @author Davidson
 */
abstract class RetornaTroco extends Facede {
    
     public float calculaTroco(int qtdTicket, float valorTicket, float valorPago){
        int qtd=qtdTicket;
        float ticket,pago,total; 
        ticket = valorTicket;
        pago = valorPago;
        total=qtd*valorTicket;
        float aux = pago-total;
         if(total>valorPago){
            JOptionPane.showMessageDialog(null,"Descupe, esta faltando dinheiro. Falta: "+ aux);
            System.out.println("\nDescupe, esta faltando dinheiro\n");//caixa de resposta
            return 0;
        }else{
           
            
            System.out.println("\nSeu troco é:"+ aux);
            return aux;        
        }
     }
}
