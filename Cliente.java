
  public class Cliente{
    private String nome;
    private String endereco;
    private Date dataLicenca;
    private String educacao;
    private String genero;
    private String classeEconomica;
    private List<Veiculo> listaVeiculos;

    // construtor
    public Cliente(String nome, String endereco, Date dataLicenca,
           String educacao, String genero, String classeEconomica,
           List<Veiculo> listaVeiculos) {
      this.nome = nome;
      this.endereco = endereco;      
      this.dataLicenca = dataLicenca;
      this.educacao = educacao;
      this.genero = genero;
      this.classeEconomica = classeEconomica;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getNome(){
      return nome;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }

    public String getEndereco(){
      return endereco;
    }

    public void setDataLicenca(String dataLicenca){
      this.dataLicenca = dataLicenca;
    }

    public Date getDataLicenca(){
      return dataLicenca;
    }

    public void setEducacao(String educacao){
      this.educacao = educacao;
    }

    public String getEducacao(){
      return educacao;
    }

    public void setGenero(String genero){
      this.genero = genero;
    }

    public String getGenero(){
      return genero;
    }

    public void setClasseEconomica(String classeEconomica){
      this.classeEconomica = classeEconomica;
    }

    public String getClasseEconomica(){
      return classeEconomica;
    }
    
    public String toString(){
      return String.format("nome: %s\nendereço: %s\ndata da licença: %s\neducação: %s\ngenêro: %s\nclasse econômica: %s", nome, endereco, dataLicenca, educacao, genero, classeEconomica);
    }
