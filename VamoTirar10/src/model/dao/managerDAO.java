/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.manager;

/**
 *
 * @author bruno
 */
public class managerDAO {
     public void create(manager c){
        Connection con =ConnectionFactory.getConnection();
        PreparedStatement stmt=null;
        
        try {
                stmt=con.prepareStatement("INSERT INTO manager(dia,proteina,refeicao)VALUES(?,?,?)");
                
                stmt.setString(2, c.getId_M());
                stmt.setDate(2, (Date) c.getSenha_G());
                stmt.setString(3, c.getLogin());
                
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "manager salvo com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao  tentar salvar o manager");
        }
        finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
}
