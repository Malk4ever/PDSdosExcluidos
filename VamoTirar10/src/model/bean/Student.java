/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Leon
 */
public class student {
     private int id_ST;
    private String nome;
    private int bad_ticket;

    public int getId_ST() {
        return id_ST;
    }

    public void setId_ST(int id_ST) {
        this.id_ST = id_ST;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBad_ticket() {
        return bad_ticket;
    }

    public void setBad_ticket(int bad_ticket) {
        this.bad_ticket = bad_ticket;
    }
   
}
