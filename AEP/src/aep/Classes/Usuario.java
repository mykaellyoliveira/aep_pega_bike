package aep.Classes;

public class Usuario {
    private String Cpf, nomeUsuario, email, senha, telefone, dtNascimento;
    private int id;
    private boolean verificado;
    private Endereco endereco;
    private Documento documento;
    
    public Usuario(String Cpf, String nomeUsuario, String email, String senha, String telefone, String dtNascimento, boolean verificado) {
        this.Cpf = Cpf;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dtNascimento = dtNascimento;
        this.verificado = verificado;
    }
    
    public Usuario(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
  
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    } 
}
