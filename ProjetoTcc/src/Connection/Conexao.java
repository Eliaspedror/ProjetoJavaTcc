/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexandre/Elias/Elzio/Julio  
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql//143.106.241.1:3306/cl18463";
        String usuario = "cl18463";
        String senha = "cl*28031989";
        try{// Try-Catch para tratar o retorno do método 'getConnection' da classe DriverManager joga uma excessão
            Class.forName(driver);
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        }catch(SQLException ex){// Tipo de Excessão recebida pelo método 'getConnection'
            throw new RuntimeException("Erro de conexão!", ex);
        }
    }
}