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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.cardapio;

/**
 *
 * @author Leon
 */
public class cardapioDAO {
    
    public void create(cardapio c){
        Connection con =ConnectionFactory.getConnection();
        PreparedStatement stmt=null;
        
        try {
                stmt=con.prepareStatement("INSERT INTO cardapio(dia,proteina,refeicao)VALUES(?,?,?)");
                
                stmt.setString(2, c.getProteina());
                stmt.setDate(2, (Date) c.getDia());
                stmt.setString(3, c.getRefeicao());
                
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "cardapio salvo com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao  tentar salvar o cardapio");
        }
        finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
}
