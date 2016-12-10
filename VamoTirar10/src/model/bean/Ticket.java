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
public class Ticket {
    private float TicketAluno;
    private float TicketProfessor;
    private float TicketServidor;    

    public float getTicketAluno() {
        return TicketAluno;
    }

    public void setTicketAluno(float TicketAluno) {
        this.TicketAluno = TicketAluno;
    }

    public float getTicketProfessor() {
        return TicketProfessor;
    }

    public void setTicketProfessor(float TicketProfessor) {
        this.TicketProfessor = TicketProfessor;
    }

    public float getTicketServidor() {
        return TicketServidor;
    }

    public void setTicketServidor(float TicketServidor) {
        this.TicketServidor = TicketServidor;
    }
}
