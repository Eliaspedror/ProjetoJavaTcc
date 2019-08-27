package model.DAO;

import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import model.BEAN.DadosCadastro;

/**
 *
 * @author Alexandre/Elias/Elzio/Julio
 */


public class DadosCadastroDAO {
    
    private Connection con = null;
    public boolean inserir (DadosCadastro dC) throws SQLException, ClassNotFoundException{
        boolean inseriu = false;
    
        try{
            con  = (Connection) new Conexao().getConnection();
            String sql = "insert into login (usuario_id, nome, email, usuario, senha, telefone, data_cadastro) values (default, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, dC.getUsuario_id());
            stmt.setString(1, dC.getNome());
            stmt.setString(2, dC.getEmail());
            stmt.setString(3, dC.getUsuario());
            stmt.setString(4, dC.getSenha());
            stmt.setString(5, dC.getTelefone());
            stmt.setDate(6, (java.sql.Date) dC.getDataTime());
            stmt.execute();
            stmt.close();
            inseriu = true;  
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        
        return inseriu;
    }
    
    
}
