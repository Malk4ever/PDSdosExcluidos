/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.sql.PreparedStatement;//classe para o sql
import java.sql.ResultSet;//comunicação entre aplicações sgbd
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;//tratamento de exceção em login
import java.util.logging.Logger;//tratamento de login

/**
 *
 * @author Wallison
 */
public class DAOAluno extends DAO{//tipo de classe que faz a interface com o banco e sistema
    private DAO dao;
    @Override
    public void insert(String aluno,int id) {//recebe da tela de cadastro
        String sql = "INSERT INTO student (id,name) VALUES ('"+aluno+"')";//inser no camp aluno
        
        
        PreparedStatement stmt;
        try {
            stmt = Conn.getInstance().getConnection().prepareStatement(sql);//aqui esta enviando a string
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println(e);
        }
    }

    
}
