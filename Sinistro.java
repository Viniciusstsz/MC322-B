
  public class Sinistro{
    private int ID(final);
    private String data;
    private String endereco;
    private Seguradora seguradora;
    private Veiculo veiculo;
    private Cliente cliente;

    // construtor
    public Sinistro(int ID, String data, Date endereco){
      this.ID = ID;
      this.data = data;      
      this.endereco = endereco;
    }

    public int getID(){
      return ID;
    }

    public void setID(int ID){
      this.ID = ID;
    }
    
    public String getData(){
      return data;
    }

    public void setData(String data){
      this.data = data;
    }
    
    public String getEndereco(){
      return endereco;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }
    
    public String toString(){
      return String.format("ID: %d\ndata: %s\nendereco: %s\nseguradora: %d\nveículo: %s\ncliente: %s", ID, data, endereco, seguradora, veiculo, cliente);
    }
    
    }
    
