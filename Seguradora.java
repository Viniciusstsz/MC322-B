
  public class Seguradora{
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private List<Sinistro> Sinisitro;
    private List<Cliente> Cliente;

    // construtor
    public Seguradora(String nome, String telefone, String email, int endereco){
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;   
      this.endereco = endereco;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getNome(){
      return nome;
    }

    public void setTelefone(String telefone){
      this.telefone = telefone;
    }

    public Date getTelefone(){
      return telefone;
    }

    public void setEmail(String email){
      this.email = email;
    }

    public String getEmail(){
      return email;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }

    public int getEndereco(){
      return endereco;
    }

