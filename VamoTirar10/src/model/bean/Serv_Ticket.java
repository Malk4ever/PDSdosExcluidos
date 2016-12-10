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
public class serv_ticket {
    private  int id_SR_T;
    private  int id_SR;
    private  Date us;
    private  Date sell;
    private float price;

    public int getId_SR_T() {
        return id_SR_T;
    }

    public void setId_SR_T(int id_SR_T) {
        this.id_SR_T = id_SR_T;
    }

    public int getId_SR() {
        return id_SR;
    }

    public void setId_SR(int id_SR) {
        this.id_SR = id_SR;
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
