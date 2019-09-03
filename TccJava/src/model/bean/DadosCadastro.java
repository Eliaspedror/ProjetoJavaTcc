package model.bean;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class DadosCadastro extends DadosLogin {
     //Atributos
    private int usuario_id;
    private String nome;
    private String email;
    private String telefone;
    private Date dataTime;
    
    //Construtores
    public DadosCadastro(String usuario, String senha, int usuario_id, String nome, String email, String telefone){
        super(usuario, senha); 
        this.setUsuario_id(usuario_id);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setDataTime(new Date());
        //this.setDataTime(new GregorianCalendar());
    }
    
    public DadosCadastro() {
       
    }
    
    //Getters e Setters
    public int getUsuario_id() {
        return usuario_id;
    }
    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Date getDataTime() {
        return dataTime;
    }
    public void setDataTime(Date dataTime){
        this.dataTime = dataTime ;
    }
}
