package control;

import java.sql.SQLException;
import model.BEAN.DadosCadastro;
import model.DAO.DadosCadastroDAO;

/**
 *
 * @author gabri
 */
public class ControlaDadosCadastro {
    
    public boolean insereCadastro(String usuario, String senha, int usuario_id, String nome, String email, String telefone) throws SQLException, ClassNotFoundException{
        DadosCadastro dC = new DadosCadastro(usuario, senha, usuario_id, nome, email, telefone);
        DadosCadastroDAO dCDAO = new DadosCadastroDAO();
        boolean inseriu = dCDAO.inserir(dC);
        return inseriu;
    }
    
    
}
