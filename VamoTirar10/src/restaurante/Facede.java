/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Davidson
 */
abstract class Facede {
    //calcula o troco na venda de tickets e seta o livro caixa, retorna o troco.
    abstract float calculoTroco(int qtdTicket, float valorTicket, float valorPago);
    //imprime os tickets no arquivo selecionado.
    abstract void imprimeTicket(int qtdImpressões);
    //recebe os tickets dos clientes, seta o ticket como usado no banco, retorna se ticket verdadeiro ou falso.
    abstract boolean recebeTicket(long nTicket);
    //cadastro de clientes, seta o cadastro, retorna se fez o cadastro corretamente.
    abstract boolean recebeCadastro(String nome, int identificador);
    //calendário
    
    //relatório geral, imprime a tabela na tela RelatorioGeral;
    abstract void relatorioGeral();
    //relatório cliente, imprime a tabela na tela Cliente;
    abstract void relatotioCliente(String tipo, int identificador);
    //criar funcionário do tipo gerente (pode tudo) ou do tipo funcionário do ru (pode vender e receber)
    abstract void criaFuncionario(String tipo, String nome, String login, String senha);
}
