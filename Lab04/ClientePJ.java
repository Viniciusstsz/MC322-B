
  public class ClientePF{
    private String(final) cnpj;
    private Date dataFundacao;
    private int qtdeFuncionarios;

    // construtor
    public ClientePF(String(final) cnpj, Date dataFundacao, int qtdeFuncionarios){
      super(String nome, String endereco, List <Veiculos> listaVeiculos, Double valorSeguro);
      this.cnpj = cnpj;
      this.dataFundacao = dataFundacao;
      this.qtdeFuncionarios = qtdeFuncionarios;
      
    }

    public String getCnpj(){
      return cnpj;
    }

    public void setCnpj(String cnpj){
      this.cnpj = cnpj;
    }

    public Date getDataFundacao(){
      return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao){
      this.dataFundacao = dataFundacao;
    }

    public Int getQtdeFuncionarios(){
      return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(Int qtdeFuncionarios){
      this.qtdeFuncionarios = qtdeFuncionarios;
    }
    
    public String toString(){
      return String.format("cnpj: %s\ndata de fundação: %s\nquantidade de funcionários: %d",
      cnpj, dataFundacao, qtdeFuncinarios);
    }
    
    @Override
    public Double calculaScore{
         return VALOR_BASE*(1+(qtdeFuncionarios)/100)*(listaVeiculos).length
    }
    
    }
    
