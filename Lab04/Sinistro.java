
  public class Sinistro{
    private int ID(final);
    private Date data;
    private String endereco;
    private Seguradora seguradora;
    private Veiculo veiculo;
    private Cliente cliente;

    // construtor
    public Sinistro(int ID, Date data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente){
      this.ID = ID;
      this.data = data;      
      this.endereco = endereco;
      this.seguradora = seguradora;
      this.veiculo = veiculo;      
      this.cliente = cliente;
    }

    public int getID(){
      return ID;
    }

    public void setID(int ID){
      this.ID = ID;
    }
    
    public Date getData(){
      return data;
    }

    public void setData(Date data){
      this.data = data;
    }
    
    public String getEndereco(){
      return endereco;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }
    
    public Seguradora getSeguradora(){
      return seguradora;
    }

    public void setSeguradora(Seguradora seguradora){
      seguradora = seguradora;
    }
    
    public Veiculo getVeiculo(){
      return Veiculo;
    }

    public void setVeiculo(Veiculo veiculo){
      veiculo = veiculo;
    }
    
    public Cliente getCliente(){
      return cliente;
    }

    public void setCliente(Cliente cliente){
      cliente = cliente;
    }
    
    public String toString(){
      return String.format("ID: %d\ndata: %s\nendereco: %s\nseguradora: %d\nveículo: %s\ncliente: %s", ID, data, endereco, seguradora, veiculo, cliente);
    }
    
    }
    
