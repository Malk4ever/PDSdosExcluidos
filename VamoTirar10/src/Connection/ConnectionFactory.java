/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leon
 */
public class ConnectionFactory {
    
    private final String DRIVER ="com.mysql.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/restaurante";
    private final String USER="root";
    private final String PASS="2508";
    
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco, meu tio.", ex);
        }
    }
    
    public static void closeConection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
    
    
    
}
  public static void closeConection(Connection con,PreparedStatement stmt){
        
               closeConection(con);
               
             if(con!=null){
            try {
                if(stmt!=null){
                    stmt.close();
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
  public static void closeConection(Connection con,PreparedStatement stmt,ResultSet rs){
        
               closeConection(con, stmt);
               
             if(con!=null){
            try {
                if(rs!=null){
                    rs.close();
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }


}