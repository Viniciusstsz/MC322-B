
  public class Seguradora{
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private List<Sinistro> listaSinistros;
    private List<Cliente> listaClientes;

    // construtor
    public Seguradora(String nome, String telefone, 
String email, String endereco, List<Sinistro> listaSinistros,
List<Cliente> listaClientes){
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;
      this.endereco = endereco;
      this.listaSinistros = listaSinistros;
      this.listaClientes = listaClientes;     
      
    }

    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getTelefone(){
      return telefone;
    }

    public void setTelefone(String telefone){
      this.telefone = telefone;
    }

    public String getEmail(){
      return email;
    }

    public void setEmail(String email){
      this.email = email;
    }

    public String getEndereco(){
      return endereco;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }

    public List<Sinistro> getListaSinistro(){
      return listaSinistro;
    }

    public void setListaSinistros(List<Sinistro> listaSinistros){
      this.listaSinistros = listaSinistros;
    }

    public List<Cliente> getListaClientes(){
      return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes){
      this.listaClientes = listaClientes;
    }

    public Boolean cadastrarCliente(Cliente cliente){         
      add(cliente).listaClientes
    }
    
    public Boolean removerCliente(String cliente){        
      remove(cliente).listaClientes      
    }
    
    public String listarCliente(String cliente){         
    }

    public Boolean gerarSinistro(){         
    }

    public Boolean visualizarSinistro(String cliente){         
    }

    public void ListarSinistros(){         
    }

    public void calcularPracoSeguroCliente(){         
    }

    public void calcularReceita(){         
    }
