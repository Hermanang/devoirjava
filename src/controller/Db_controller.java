
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Db_controller {
    
     private Connection getConnection() throws SQLException{
        Connection connection = null;
        
        try{
             Class.forName( "com.mysql.jdbc.Driver" );
             connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/examenJava", "root","");
             
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage()+"Pas de connexion");
        }
        return connection;
    }
     
     public ResultSet executeRequeteRslt(String sql){
        Statement statement = null;
        ResultSet resultat = null;
       
        try{
            Connection connection = getConnection();
            statement = connection.createStatement();
            resultat = statement.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return resultat;
    }
     
}
