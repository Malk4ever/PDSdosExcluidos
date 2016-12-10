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
public class Professor {
    private int id_PR;
    private String nome;
    private int bad_ticket;

    public int getId_PR() {
        return id_PR;
    }

    public void setId_PR(int id_PR) {
        this.id_PR = id_PR;
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
