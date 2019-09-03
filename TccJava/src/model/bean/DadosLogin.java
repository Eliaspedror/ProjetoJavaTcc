package model.bean;

/**
 *
 * @author 
 */
public class DadosLogin {
    //Atributos
    private String usuario;
    private String senha;
    
    //Getters e Setters
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    //Contrutores
    
    public DadosLogin(String usuario, String senha){
        this.setUsuario(usuario);
        this.setSenha(senha);
    }
    
    public DadosLogin(){
        
    }
}
