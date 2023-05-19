
  public class Cliente{
    private String nome;
    private String endereco;
    private List<Veiculos> listaVeiculos;
    private Double valorSeguro;

    // construtor
    public Cliente(String nome, String endereco, List <Veiculos> listaVeiculos, Double valorSeguro){
      this.nome = nome;
      this.endereco = endereco;
      this.valorSeguro = valorSeguro;
      this.listaVeiculos = listaVeiculos;
    }

    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }
        
    public String getEndereco(){
      return endereco;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }
    
    public List<Veiculos> getListaVeiculos(){
      return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculos> listaVeiculos){
      this.listaVeiculos = listaVeiculos;
    }
    
    public Double getValorSeguro(){
      return valorSeguro;
    }

    public void setValorSeguro(Double valorSeguro){
      this.valorSeguro = valorSeguro;
    }
    
    public String toString(){
      return String.format("nome: %d\nendereço: %s\nvalor do seguro: %d\nlista de veículos: %s", nome, endereco, valorSeguro, listaVeiculos);
    }
    
    public Double calculaScore{
    
    }
    
    }
    
