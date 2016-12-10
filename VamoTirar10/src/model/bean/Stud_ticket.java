/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Date;

/**
 *
 * @author Leon
 */
public class Stud_ticket {
    private  int id_ST_T;
    private  int id_ST;
    private  Date us;
    private  Date sell;

    public int getId_ST_T() {
        return id_ST_T;
    }

    public void setId_ST_T(int id_ST_T) {
        this.id_ST_T = id_ST_T;
    }

    public int getId_ST() {
        return id_ST;
    }

    public void setId_ST(int id_ST) {
        this.id_ST = id_ST;
    }

    public Date getUs() {
        return us;
    }

    public void setUs(Date us) {
        this.us = us;
    }

    public Date getSell() {
        return sell;
    }

    public void setSell(Date sell) {
        this.sell = sell;
    }
    
    
    
}
