
  public class ClientePF{
    private String(final) cpf;
    private String genero;
    private Date dataLicenca;
    private String educacao;
    private Date dataNascimento;
    private String classeEconomica;

    // construtor
    public ClientePF(String(final) cpf, String genero, Date dataLicenca, String educacao, Date dataNascimento, String classeEconomica){
      super(String nome, String endereco, List <Veiculos> listaVeiculos, Double valorSeguro);
      this.cpf = cpf;
      this.genero = genero;
      this.dataLicenca = dataLicenca;
      this.educacao = educacao;
      this.dataNascimento = dataNascimento;
      this.classeEconomica = classeEconomica;     
      
    }

    public String getCpf(){
      return cpf;
    }

    public void setCpf(String cpf){
      this.cpf = cpf;
    }

    public String getGenero(){
      return genero;
    }

    public void setCpf(String genero){
      this.genero = genero;
    }

    public Date getDataLicenca(){
      return dataLicenca;
    }

    public void setDataLicenca(String dataLicenca){
      this.dataLicenca = dataLicenca;
    }

    public String getEducacao(){
      return educacao;
    }

    public void setEducacao(String educacao){
      this.educacao = educacao;
    }

    public Date getDataNascimento(){
      return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
      this.dataNascimento = dataNascimento;
    }

    public String getClasseEconomica(){
      return classeEconomica;
    }

    public void setClasseEconomica(String classeEconomica){
      this.classeEconomica = classeEconomica;
    }      
    
    public String toString(){
      return String.format("cpf: %d\ngenero: %s\ndata da licenca: %d\n
      educacao: %s\ndata de nascimento: %d\nclasse economica: %s",
      cpf, genero, dataLicenca, educacao, dataNascimento, classeEconomica);
    }
    
    @Override
    public Double calculaScore{
         return VALOR_BASE*FATOR_IDADE*(listaVeiculos).length
    }
    
    }
    
