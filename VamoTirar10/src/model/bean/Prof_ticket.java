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
public class Prof_ticket {
    private  int id_PR_T;
    private  int id_PR;
    private  Date us;
    private  Date sell;

    public int getId_PR_T() {
        return id_PR_T;
    }

    public void setId_PR_T(int id_PR_T) {
        this.id_PR_T = id_PR_T;
    }

    public int getId_PR() {
        return id_PR;
    }

    public void setId_PR(int id_PR) {
        this.id_PR = id_PR;
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
